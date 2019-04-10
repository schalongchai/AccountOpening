package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoBulkFile;

@Repository
public interface AoBulkFileRepository extends CrudRepository<AoBulkFile, Long>{


}