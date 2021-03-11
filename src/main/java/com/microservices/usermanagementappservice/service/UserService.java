package com.microservices.usermanagementappservice.service;

import java.util.List;

import com.microservices.usermanagementappservice.dto.User;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(String id);

	public void addUser(User user);

	public User updateUser(User user);

	public User deleteUser(String id);

}
