package com.example.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService u;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/{userid}")
	public User getuser(@PathVariable Long userid) {
		User user = u.getuser(userid);
		
		
	 List<Contact> list = this.restTemplate.getForObject("http://contact-service/contact/user/"+userid,List.class);
		
		user.setContacts(list);
		return user;
		
	}

}
