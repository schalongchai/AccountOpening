package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoUser;

@Repository
public interface AoUserRepository extends CrudRepository<AoUser, Long>{


}