package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoAccountInfo;

@Repository
public interface AoAccountInfoRepository extends CrudRepository<AoAccountInfo, Long>{

}