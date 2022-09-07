package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContacts(Long userid);

}
