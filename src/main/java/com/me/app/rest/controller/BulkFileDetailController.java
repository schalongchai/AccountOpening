package com.me.app.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.AoBulkDetail;
import com.me.app.service.BulkFileDetailService;

@RestController
@RequestMapping("/api")

public class BulkFileDetailController {
	@Autowired
	BulkFileDetailService bulkFileService;
	
	@RequestMapping(value = "/bulkfiles/{id}/files/", method = RequestMethod.GET)
	public ResponseEntity<List<AoBulkDetail>> getByID(@PathVariable("id") Long id) {
		
		List<AoBulkDetail> c = bulkFileService.getById(id);
		if(c!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
	}
	
	@RequestMapping(value = "/bulkfiles/{id_file}/files/{seq}", method = RequestMethod.GET)
	public ResponseEntity<List<AoBulkDetail>> getByFileAndID(@PathVariable("id_file") Long id_file, @PathVariable("seq") Long seq) {
		
		List<AoBulkDetail> c = bulkFileService.getByFileAndSeq(id_file, seq);
		if(c!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
	}
	
	@RequestMapping(value = "/bulkfiles/{id}/files/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAoBulkFile(@RequestBody AoBulkDetail c) {
		bulkFileService.Add(c);	
	}
	
	@RequestMapping(value = "/bulkfiles/{id}/files/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateAoBulkFile(@RequestBody AoBulkDetail c) {
		bulkFileService.Update(c);	
	}
	
	@RequestMapping(value = "/bulkfiles/{id_file}/files/{id_detail}", method = RequestMethod.DELETE)
	public void deleteByIDFileAndDetail(@PathVariable("id_file") Long id_file, @PathVariable("id_detail") Long id_detail) {
		if(id_file!=null && id_detail!=null) {
			bulkFileService.deleteByfileIdAndDetailId(id_file, id_detail);

		}
		
	}
	
}
