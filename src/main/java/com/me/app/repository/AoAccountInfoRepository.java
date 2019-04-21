package com.me.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoAccountInfo;

@Repository
public interface AoAccountInfoRepository extends CrudRepository<AoAccountInfo, Long>{

	@Query(value = "SELECT * FROM AO_ACCOUNT_INFO where CIF_NO = ?1 ", nativeQuery = true)
	public List<AoAccountInfo> findByCifNo(Long cifno);
	
	@Query(value = "SELECT * FROM AO_ACCOUNT_INFO where CIF_NO = ?1 and AC_NO = ?2 ", nativeQuery = true)
	public AoAccountInfo findByCifNoAndAccountNo(Long cifno,Long accNo);
	
	@Query(value = "DELETE FROM AO_ACCOUNT_INFO where CIF_NO = ?1 and AC_NO = ?2 ", nativeQuery = true)
	public void deleteByCifNoAndAccountNo(Long cifno,Long accNo);
	
}