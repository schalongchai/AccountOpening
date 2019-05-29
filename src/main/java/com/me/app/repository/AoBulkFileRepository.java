package com.me.app.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.me.app.model.AoBulkFile;

@Repository
public interface AoBulkFileRepository extends CrudRepository<AoBulkFile, Long>{

	@Query(value = "SELECT * FROM AO_BULK_FILES where ID_FILE = ?1" , nativeQuery = true)
	public AoBulkFile findByFileID(Long fileid);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM AO_BULK_FILES where ID_FILE = ?1" , nativeQuery = true)
	public void deleteByFileID(String fileid);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM AO_BULK_DETAIL where ID_FILE = ?1" , nativeQuery = true)
	public void deleteDetailByFileID(String fileid);


}