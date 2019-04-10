package com.me.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	@Query(value = "SELECT * FROM customer where name like %?1% ", nativeQuery = true)
	public List<Customer> findByName(String fname);

}
