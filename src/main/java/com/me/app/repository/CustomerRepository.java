package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
