package com.microservices.usermanagementappservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.usermanagementappservice.Repository.UserRepository;
import com.microservices.usermanagementappservice.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
	
	@Override
	public User getUserById(String id) {
		return userRepository.getUserById(id);
	}
	
	@Override
	public void addUser(User user) {
		userRepository.addUser(user);
	}
	
	@Override
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}
	
	@Override
	public User deleteUser(String id) {
		return userRepository.deleteUser(id);
	}

	

}
