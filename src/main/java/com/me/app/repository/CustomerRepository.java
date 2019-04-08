package com.me.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.me.app.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	
	

}
