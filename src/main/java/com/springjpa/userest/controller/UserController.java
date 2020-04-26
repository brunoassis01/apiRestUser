package com.springjpa.userest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.userest.entity.User;
import com.springjpa.userest.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public User save(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public User update(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		this.userRepository.deleteById(id);
	}
}
