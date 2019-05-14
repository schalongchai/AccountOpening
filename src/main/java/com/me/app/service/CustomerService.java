package com.me.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.AoCustomerInfo;
import com.me.app.repository.AoCustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private AoCustomerRepository custRepo;

	public List<AoCustomerInfo> getAll() {
		List<AoCustomerInfo> AoCustomerInfos = (List<AoCustomerInfo>) custRepo.findAll();
		return AoCustomerInfos;
	}

	public AoCustomerInfo getById(Long id) {
		Optional<AoCustomerInfo> AoCustomerInfos = custRepo.findById(id);
		return AoCustomerInfos.isPresent() ? AoCustomerInfos.get() : null;
	}

	public void deleteById(Long id) {
		custRepo.deleteById(id);
	}

	public void Add(AoCustomerInfo c) {
		if (!custRepo.existsById(c.getCifNo())) {
			custRepo.save(c);
		}
	}

	public void Update(AoCustomerInfo c) {
		if (custRepo.existsById(c.getCifNo())) {
			custRepo.save(c);
		}
	}

	public List<AoCustomerInfo> getByName(String name) {
		return custRepo.findByName(name);
	}
	
	public List<AoCustomerInfo> getBySearch(String cif,String fname,String lname,String citizen,String acctno) {
		return custRepo.findBySearch(cif,fname,lname,citizen,acctno);
	}

}
