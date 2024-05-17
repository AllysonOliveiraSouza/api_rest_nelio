package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.UserEntity;
import com.api.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<UserEntity> findAll(){
		List<UserEntity>listUsers = userRepository.findAll();
		return listUsers;		
	}
	
	@GetMapping("/{id}")
	public UserEntity findById(@PathVariable Long id) {
		UserEntity user = userRepository.findById(id).get();
		return user;
	}
	
	@PostMapping
	public UserEntity insertUser(@RequestBody UserEntity user) {
		UserEntity User = userRepository.save(user);
		return User;
	}	
	

}
