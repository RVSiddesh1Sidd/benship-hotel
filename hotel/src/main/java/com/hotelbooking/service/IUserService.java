package com.hotelbooking.service;

import java.util.List;

import com.hotelbooking.entity.User;

public interface IUserService {

	User registerUser(User user);
	List<User> getUsers();
	void deleteUser(String email);
	User getUser(String email);
	
}
