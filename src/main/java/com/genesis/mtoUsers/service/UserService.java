package com.genesis.mtoUsers.service;

import java.util.List;

import com.genesis.mtoUsers.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

}
