package com.me.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.me.app.model.AoUsersRole;

@Repository
public interface AoUserRoleRepository extends CrudRepository<AoUsersRole, Long>{


}