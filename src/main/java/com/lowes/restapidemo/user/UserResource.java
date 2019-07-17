package com.lowes.restapidemo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService dao;
	
	@GetMapping("/users")
	public List<User> retrieveAll() {
		return dao.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveOne(@PathVariable int id) {
		return dao.findOne(id);
	}
	
	@PostMapping("/user")
	public User insertOne(@RequestBody User user) {
		return dao.save(user);
	}
}
