package com.albanero.UserDetails.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albanero.UserDetails.Repository.User_Repository;
import com.albanero.UserDetails.model.User;

@Service
public class User_Service {

	@Autowired
	private User_Repository ur;

	public List<User> getAllUsers() {
		return ur.findAll();
	}

	public List<User> getUserByUsername(String username) {
		return ur.findUserByUsername(username);
	}

	public User saveUser(User u) {
		return ur.save(u);
	}

	public User updateUser(String username, User u) {
		return ur.save(u);
	}

	public void deleteUser(String username) {
		ur.delete(ur.findUserByUsername(username).get(0));
	}
}
