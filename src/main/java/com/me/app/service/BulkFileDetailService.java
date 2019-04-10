package com.me.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.AoBulkDetail;
import com.me.app.repository.AoBulkFileDetailRepository;


@Service
public class BulkFileDetailService {
	@Autowired
	private AoBulkFileDetailRepository bulkRepo;

	public List<AoBulkDetail> getAll() {
		List<AoBulkDetail> AoBulkDetails = (List<AoBulkDetail>) bulkRepo.findAll();
		return AoBulkDetails;
	}

	public AoBulkDetail getById(Long id) {
		Optional<AoBulkDetail> AoBulkDetails = bulkRepo.findById(id);
		return AoBulkDetails.isPresent() ? AoBulkDetails.get() : null;
	}

	public void deleteById(Long id) {
		bulkRepo.deleteById(id);
	}

	public void Add(AoBulkDetail c) {
		if (!bulkRepo.existsById(c.getId().getIdFile())) {
			bulkRepo.save(c);
		}
	}

	public void Update(AoBulkDetail c) {
		if (bulkRepo.existsById(c.getId().getIdFile())) {
			bulkRepo.save(c);
		}
	}




}
