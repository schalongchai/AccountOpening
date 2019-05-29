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

import com.me.app.model.AoBulkFile;
import com.me.app.model.CustomResponse;
import com.me.app.service.BulkFileService;

@RestController
@RequestMapping("/api")

public class BulkFileController {
	@Autowired
	BulkFileService bulkFileService;

	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomResponse> addAoBulkFile(@RequestBody AoBulkFile c) {
		CustomResponse cRes = bulkFileService.Add(c);
		if(cRes.getError().equals("")) {
			return ResponseEntity.status(HttpStatus.OK).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(cRes);
		}
	}

	@RequestMapping(value = "/bulkfiles/{id}", method = RequestMethod.DELETE)
	public void deleteByID(@PathVariable("id") String id) {
		bulkFileService.deleteById(id);
		
	}

	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.GET)
	public List<AoBulkFile> getAll() {
		return bulkFileService.getAll();
	}

	@RequestMapping(value = "/bulkfiles/{id}", method = RequestMethod.GET)
	public ResponseEntity<AoBulkFile> getByID(@PathVariable("id") Long id) {
		
		AoBulkFile c = bulkFileService.getById(id);
		if(c!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
	}


	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.PUT)
	public void updateByID(@RequestBody AoBulkFile c) {
		bulkFileService.Update(c);
	}

}
