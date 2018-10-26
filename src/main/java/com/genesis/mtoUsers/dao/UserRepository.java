package com.genesis.mtoUsers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genesis.mtoUsers.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

}
