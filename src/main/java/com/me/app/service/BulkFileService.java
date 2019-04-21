package com.me.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.me.app.model.AoBulkFile;
import com.me.app.repository.AoBulkFileDetailRepository;
import com.me.app.repository.AoBulkFileRepository;


@Service
public class BulkFileService {
	@Autowired
	private AoBulkFileRepository bulkRepo;
	
	@Autowired
	private AoBulkFileDetailRepository bulkDetailRepo;

	public List<AoBulkFile> getAll() {
		List<AoBulkFile> AoBulkFiles = (List<AoBulkFile>) bulkRepo.findAll();
		return AoBulkFiles;
	}

	public AoBulkFile getById(Long id) {
		AoBulkFile aoBulkFiles = bulkRepo.findByFileID(id);
		return aoBulkFiles;
	}
	

	public void deleteById(Long id) {
		bulkRepo.deleteByFileID(id);
		bulkRepo.deleteDetailByFileID(id);
	}

	public void Add(AoBulkFile c) {
		if (!bulkRepo.existsById(c.getId())) {
			bulkRepo.save(c);	
			bulkDetailRepo.save(c.getAoBulkDetail());
		}
	}

	public void Update(AoBulkFile c) {
		if (bulkRepo.existsById(c.getId())) {
			bulkRepo.save(c);
			bulkDetailRepo.save(c.getAoBulkDetail());
		}
	}




}
