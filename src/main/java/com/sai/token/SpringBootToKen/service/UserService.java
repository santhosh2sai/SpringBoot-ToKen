package com.sai.token.SpringBootToKen.service;

import com.sai.token.SpringBootToKen.model.User;

public interface UserService {

	User findUserByEmail(String email);
	void saveUser(User user);
}
