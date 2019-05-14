package com.me.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoCustomerInfo;

@Repository
public interface AoCustomerRepository extends CrudRepository<AoCustomerInfo, Long>{
	
	@Query(value = "SELECT * FROM AO_CUSTOMER_INFO where FIRST_NAME_TH like %?1% ", nativeQuery = true)
	public List<AoCustomerInfo> findByName(String fname);
	
	@Query(value = "SELECT * FROM AO_CUSTOMER_INFO where CIF_NO like %?1% AND FIRST_NAME_TH like %?2% "
			+ " AND LAST_NAME_TH like %?3% "
			+ " AND CITIZEN_ID like %?4% ",
			 nativeQuery = true)
	public List<AoCustomerInfo> findBySearch(String cif,String fname,String lname,String citizen,String acctno);

}
