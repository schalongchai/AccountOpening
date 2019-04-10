package com.me.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.me.app.model.AoBulkFile;
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
		Optional<AoBulkFile> AoBulkFiles = bulkRepo.findById(id);
		return AoBulkFiles.isPresent() ? AoBulkFiles.get() : null;
	}
	

	public void deleteById(Long id) {
		bulkRepo.deleteById(id);
	}

	public void Add(AoBulkFile c) {
		if (!bulkRepo.existsById(c.getId().getIdFile())) {
			bulkRepo.save(c);
		}
	}

	public void Update(AoBulkFile c) {
		if (bulkRepo.existsById(c.getId().getIdFile())) {
			bulkRepo.save(c);
		}
	}




}
