package com.xumeng.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.xumeng.adminportal.domain.security.Role;


public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByname(String name);
}
