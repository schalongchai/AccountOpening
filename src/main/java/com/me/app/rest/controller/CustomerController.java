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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.Customer;
import com.me.app.service.CustomerService;

@RestController
@RequestMapping("/api")

public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customers/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addCustomer(@RequestBody Customer c) {
		customerService.Add(c);
	}

	@RequestMapping(value = "/customers/{cifno}", method = RequestMethod.DELETE)
	public void deleteByID(@PathVariable("cifno") Long id) {
		customerService.deleteById(id);
		;
	}

	@RequestMapping(value = "/customers/", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAll();
	}

	@RequestMapping(value = "/customers/{cifno}", method = RequestMethod.GET)
	public Customer getByID(@PathVariable("cifno") Long id) {
		return customerService.getById(id);
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getBySearch(@RequestParam(value = "fname") String fname,
			@RequestParam(value = "lname") String lname) {
		List<Customer> c = customerService.getByName(fname);
		if (c.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
		return ResponseEntity.status(HttpStatus.OK).body(c);
	}

	@RequestMapping(value = "/customers/", method = RequestMethod.PUT)
	public void updateByID(@RequestBody Customer c) {
		customerService.Update(c);
	}

}
