package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {
	
	@Autowired
	Userservice c;
	
	
	@Autowired
	Userrepository repo;
	
	
	
	@PostMapping("/register")
	public String register(@RequestBody User x) {
		
		c.add(x);
		return "User Registered Sucessfully";
		
	}
	
	@GetMapping("/login/{email}/{password}")
	public String login(@PathVariable String email,@PathVariable String password) {
		Optional<User> w=repo.login(email, password);
		if(!w.isEmpty()) {
			
		
		return"login Sucessfully";
	}else {
		return "Bad Credential";
		
	}
		
		
	 	
	    

}

}