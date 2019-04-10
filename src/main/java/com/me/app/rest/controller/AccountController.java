package com.me.app.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.AoAccountInfo;
import com.me.app.service.AccountInfoService;


@RestController
@RequestMapping("/api")

public class AccountController {
	@Autowired
	AccountInfoService accountService;

	@RequestMapping(value = "/accounts/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAoAccountInfo(@RequestBody AoAccountInfo c) {
		accountService.Add(c);
	}

	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
	public void deleteByID(@PathVariable("id") Long id) {
		accountService.deleteById(id);

	}

	@RequestMapping(value = "/accounts/", method = RequestMethod.GET)
	public List<AoAccountInfo> getAll() {
		return accountService.getAll();
	}

	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
	public AoAccountInfo getByID(@PathVariable("id") Long id) {
		return accountService.getById(id);
	}


	@RequestMapping(value = "/accounts/", method = RequestMethod.PUT)
	public void updateByID(@RequestBody AoAccountInfo c) {
		accountService.Update(c);
	}

}
