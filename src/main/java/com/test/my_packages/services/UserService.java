package com.test.my_packages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.my_packages.models.User;

@Service
public interface UserService {
	public boolean createUser(User user);
	public User updateUser(User user);
	public User findUser(Integer id);
	public User findUserByEmail(String email);
	public List<User> userList();

}
