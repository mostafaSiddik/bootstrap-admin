package com.test.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.User;
import com.test.repositories.UsersReposotory;
import com.test.services.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UsersReposotory usersReposotory;

	public boolean createUser(User user) {
		usersReposotory.save(user);
		return true; // TODO: Check exeptions and remove static true returned
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByEmail(String email) {
		User users = usersReposotory.findByEmail(email);
		return users;
	}

	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

}
