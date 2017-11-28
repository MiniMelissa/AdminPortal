package com.xumeng.adminportal.service;

import java.util.Set;

import com.xumeng.adminportal.domain.User;
import com.xumeng.adminportal.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);
	
	User save(User user);
}
