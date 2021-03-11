package com.microservices.usermanagementappservice.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.microservices.usermanagementappservice.dto.User;
import com.microservices.usermanagementappservice.service.UserService;

@RestController
@RequestMapping("/user-management-api")
public class UserController {

	Logger log = LoggerFactory.getLogger("UserManagementApplication");
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		log.info("Getting User Details");
		return userservice.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable String id) {
		return userservice.getUserById(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		userservice.addUser(user);
		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(path).build();	
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userservice.updateUser(user);				
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable String id) {
		return userservice.deleteUser(id);
	}
	
	@GetMapping("/logs")
	public String logs() {
		log.trace("A TRACE message");
		log.debug("A DEBUG message");
		log.info("An INFO message");
		log.warn("A WARN message");
		log.error("An ERROR message");
		return "Different level of logs";
	}
}
