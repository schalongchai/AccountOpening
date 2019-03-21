package com.me.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.model.Customer;
import com.me.app.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custRepo;

	public List<Customer> getAll() {
		List<Customer> customers = (List<Customer>) custRepo.findAll();
		return customers;
	}

	public Customer getById(Long id) {
		Optional<Customer> customers = custRepo.findById(id);
		return customers.isPresent() ? customers.get() : null;
	}

	public void deleteById(Long id) {
		custRepo.deleteById(id);
	}

	public void Add(Customer c) {
		if(!custRepo.existsById(c.getId())){
			custRepo.save(c);
		}
	}





}
