package com.me.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.me.app.model.AoAccountInfo;
import com.me.app.model.CustomResponse;
import com.me.app.repository.AoAccountInfoRepository;
import com.me.app.repository.AoCustomerRepository;


@Service
public class AccountInfoService {
	@Autowired
	private AoAccountInfoRepository accountRepo;
	
	@Autowired
	private AoCustomerRepository customerRepo;

	public List<AoAccountInfo> getAll() {
		List<AoAccountInfo> AoAccountInfos = (List<AoAccountInfo>) accountRepo.findAll();
		return AoAccountInfos;
	}

	public AoAccountInfo getById(Long id) {
		Optional<AoAccountInfo> AoAccountInfos = accountRepo.findById(id);
		return AoAccountInfos.isPresent() ? AoAccountInfos.get() : null;
	}
	
	public List<AoAccountInfo> getByCif(Long cif) {
		List<AoAccountInfo> AoAccountInfos = accountRepo.findByCifNo(cif);
		return AoAccountInfos;
	}
	
	public List<AoAccountInfo> getByDateBranch(String start, String end, String branch ) {
		 
		List<AoAccountInfo> aoAccountInfos = new ArrayList<AoAccountInfo>();
	
		//Convert to yyyy-mm-dd
	    String s = start.substring(6,10)+"-"+start.substring(3,5)+"-"+start.substring(0,2);
	    String e = end.substring(6,10)+"-"+end.substring(3,5)+"-"+end.substring(0,2);
	    
        if(!branch.equals("all")) {
        	aoAccountInfos = accountRepo.findByDateBranch(s, e, branch);
        }else {
        	aoAccountInfos = accountRepo.findByDate(s, e);
        }
		
		return aoAccountInfos;
	}
	
	public AoAccountInfo getByCifAndAccountNo(Long cif,Long AcctNo) {
		AoAccountInfo AoAccountInfos = accountRepo.findByCifNoAndAccountNo(cif,AcctNo);
		return AoAccountInfos;
	}
	
	public CustomResponse deleteByCifAndId(Long cif,Long actNo) {
		CustomResponse cRes = new CustomResponse();
		AoAccountInfo a = accountRepo.findByCifNoAndAccountNo(cif, actNo);
		if (a != null) {
			accountRepo.delete(a);
			cRes.setError("");
		} else {
			cRes.setError("Can not delete account, account does not exist");
			cRes.setMessage("Account no " + actNo.toString() + "Cif no "+cif.toString());
		}
		return cRes;
	}

	public CustomResponse Add(AoAccountInfo c) {

		AoAccountInfo a = accountRepo.findByCifNoAndAccountNo(c.getId().getCifNo(),c.getId().getAcNo());
		CustomResponse cRes = new CustomResponse();
		
		if(!customerRepo.findById(c.getId().getCifNo()).isPresent()) {//CIF does not exist
			cRes.setError("Can not create account, CIF does not exist");
			cRes.setMessage("Please create CIF no "+c.getId().getCifNo() + " before create account");
			return cRes;
		}
		
		if (a==null) { // Account does not exist, Create a new
			accountRepo.save(c);
			cRes.setError("");
			return cRes;
		}else {
			cRes.setError("Can not create account, Record already existed");
			cRes.setMessage("Account no "+c.getId().getAcNo() + ", CIF no " + c.getId().getCifNo());
			return cRes;
		}
		
	}

	public void Update(AoAccountInfo c) {
		AoAccountInfo a = accountRepo.findByCifNoAndAccountNo(c.getId().getCifNo(),c.getId().getAcNo());
		if (a!=null) {
			accountRepo.save(c);
		}
	}




}
