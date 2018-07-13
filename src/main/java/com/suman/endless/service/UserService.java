package com.suman.endless.service;

import java.util.List;

import com.suman.endless.model.User;

public interface UserService {
	User findUserByEmail(String email);

	void saveUser(User user, String location);

	List<User> getAllUser();

	void deleteById(Integer id);
}
