package com.xumeng.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.xumeng.adminportal.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	
}
