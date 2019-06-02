package com.me.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoBulkDetail;

@Repository
public interface AoBulkFileDetailRepository extends CrudRepository<AoBulkDetail, Long>{
	@Query(value = "SELECT * FROM AO_BULK_DETAIL where ID_FILE = ?1 order by SEQ" , nativeQuery = true)
	public List<AoBulkDetail> findByFileID(Long fileid);
	
	@Query(value = "SELECT * FROM AO_BULK_DETAIL where ID_FILE = ?1 and SEQ =?2" , nativeQuery = true)
	public List<AoBulkDetail> findByFileIdAndSeq(Long fileid,Long seq);
	

	@Query(value = "DELETE FROM AO_BULK_DETAIL where ID_FILE = ?1 AND ID_DETAIL = ?2", nativeQuery = true)
	public void deleteByFileIdAndDetailId(Long id_file,Long id_detail);
	

}