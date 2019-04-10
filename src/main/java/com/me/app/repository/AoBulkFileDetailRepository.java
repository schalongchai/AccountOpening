package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoBulkDetail;

@Repository
public interface AoBulkFileDetailRepository extends CrudRepository<AoBulkDetail, Long>{

}