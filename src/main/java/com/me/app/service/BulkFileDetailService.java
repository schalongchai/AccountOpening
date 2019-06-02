package com.me.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.AoBulkDetail;
import com.me.app.repository.AoBulkFileDetailRepository;


@Service
public class BulkFileDetailService {
	
	@Autowired
	private AoBulkFileDetailRepository bulkFileDetailRepo;
	
	
	public List<AoBulkDetail> getAll() {
		List<AoBulkDetail> AoBulkDetails = (List<AoBulkDetail>) bulkFileDetailRepo.findAll();
		return AoBulkDetails;
	}

	public List<AoBulkDetail> getById(Long id) {
		List<AoBulkDetail> AoBulkDetails = bulkFileDetailRepo.findByFileID(id);
		return AoBulkDetails;
	}
	
	public List<AoBulkDetail> getByFileAndSeq(Long idfile,Long seq) {
		List<AoBulkDetail> AoBulkDetails = bulkFileDetailRepo.findByFileIdAndSeq(idfile,seq);
		return AoBulkDetails;
	}

	public void deleteByfileIdAndDetailId(Long id_file,Long id_detail) {
		if (bulkFileDetailRepo.existsById(id_detail)) {
			bulkFileDetailRepo.deleteById(id_detail);
		}
	}

	public void Add(AoBulkDetail c) {
		if (!bulkFileDetailRepo.existsById(c.getId_detail())) {
			bulkFileDetailRepo.save(c);
			
		}
	}

	public void Update(AoBulkDetail c) {
		if (bulkFileDetailRepo.existsById(c.getId_detail())) {
			bulkFileDetailRepo.save(c);
			
		}
	}




}
