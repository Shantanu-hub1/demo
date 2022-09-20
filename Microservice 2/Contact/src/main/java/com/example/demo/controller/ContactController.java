package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService v;
	
	@GetMapping("/user/{userid}")
	public List<Contact> get(@PathVariable Long userid){
		 
		List<Contact> l =v.getContacts(userid);
		
		return l;
		
	}
	

}
