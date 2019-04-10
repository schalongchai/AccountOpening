package com.me.app.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.AoBulkFile;
import com.me.app.service.BulkFileService;

@RestController
@RequestMapping("/api")

public class BulkFileController {
	@Autowired
	BulkFileService bulkFileService;

	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAoBulkFile(@RequestBody AoBulkFile c) {
		bulkFileService.Add(c);
	}

	@RequestMapping(value = "/bulkfiles/{id}", method = RequestMethod.DELETE)
	public void deleteByID(@PathVariable("id") Long id) {
		bulkFileService.deleteById(id);
		;
	}

	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.GET)
	public List<AoBulkFile> getAll() {
		return bulkFileService.getAll();
	}

	@RequestMapping(value = "/bulkfiles/{id}", method = RequestMethod.GET)
	public AoBulkFile getByID(@PathVariable("id") Long id) {
		return bulkFileService.getById(id);
	}


	@RequestMapping(value = "/bulkfiles/", method = RequestMethod.PUT)
	public void updateByID(@RequestBody AoBulkFile c) {
		bulkFileService.Update(c);
	}

}
