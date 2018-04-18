package com.spring.boot.rest.ful.service;

import java.util.List;

import com.spring.boot.rest.ful.model.User;

public interface UserService {

	User findById(long id);
	
	User findById(long id, double salary, int age);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	boolean isUserExist(User user);
}
