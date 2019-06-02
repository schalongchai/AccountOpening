package com.me.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.me.app.model.AoBulkFile;
import com.me.app.model.CustomResponse;
import com.me.app.repository.AoBulkFileRepository;


@Service
public class BulkFileService {
	@Autowired
	private AoBulkFileRepository bulkRepo;

	public List<AoBulkFile> getAll() {
		List<AoBulkFile> AoBulkFiles = (List<AoBulkFile>) bulkRepo.findAll();
		return AoBulkFiles;
	}

	public AoBulkFile getById(Long id) {
		AoBulkFile aoBulkFiles = bulkRepo.findByFileID(id);
		return aoBulkFiles;
	}
	

	public void deleteById(String id) {
		bulkRepo.deleteByFileID(id);
		bulkRepo.deleteDetailByFileID(id);
	}

	public CustomResponse Add(AoBulkFile c) {
		CustomResponse cRes = new CustomResponse();
		if (!bulkRepo.existsById(c.getId())) {
			bulkRepo.save(c);	
			cRes.setError("");
			cRes.setMessage("");
		}else {
			cRes.setError("Can not add bulk file");
			cRes.setMessage("Bulk file id " + c.getId().toString() + " already existed");
		}
		
		return cRes;
	}

	public void Update(AoBulkFile c) {
		
		if (bulkRepo.existsById(c.getId())){
			bulkRepo.save(c);
		}
	}




}
