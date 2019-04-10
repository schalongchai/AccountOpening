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

import com.me.app.model.AoUser;
import com.me.app.service.UserService;


@RestController
@RequestMapping("/api")

public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/users/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAoUser(@RequestBody AoUser c) {
		userService.Add(c);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteByID(@PathVariable("id") Long id) {
		userService.deleteById(id);

	}

	@RequestMapping(value = "/users/", method = RequestMethod.GET)
	public List<AoUser> getAll() {
		return userService.getAll();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<AoUser> getByID(@PathVariable("id") Long id) {
		AoUser u = new AoUser();
		u = userService.getById(id);
		if (u==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(u);
		}
		return ResponseEntity.status(HttpStatus.OK).body(u);
	}


	@RequestMapping(value = "/users/", method = RequestMethod.PUT)
	public void updateByID(@RequestBody AoUser c) {
		userService.Update(c);
	}

}
