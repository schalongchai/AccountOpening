package com.me.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.Customer;
import com.me.app.service.CustomerService;


@RestController
@RequestMapping("/api")

public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customer/", method = RequestMethod.GET)
	public List<Customer> getAllCust() {
		return customerService.getAll();
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") Long id) {
        return customerService.getById(id);
    }

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public void deleteCustomerByID(@PathVariable("id") Long id) {
        customerService.deleteById(id);;
    }

	@RequestMapping(value = "/customer/", method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addCustomer(@RequestBody Customer c) {
		customerService.Add(c);
    }

}

