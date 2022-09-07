package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;

@Service
public class Userservice {
	
	
	@Autowired
	Userrepository repo;
	
	
	public void add(User u) {
		repo.save(u);
	}
	
	


}
