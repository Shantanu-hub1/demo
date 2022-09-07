package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;

@Service
public class ContactServiceImpl  implements ContactService{
	
	List<Contact> list=List.of(
			new Contact(1L, "shantanu@gmail.com","Shantanu", 1L),
			new Contact(2L, "raj@gmail.com","Raj", 2L),
			new Contact(3L, "rajesh@gmail.com","Rajesh", 3L),
			new Contact(4L, "bikash@gmail.com","Bikash", 4L),
			new Contact(5L, "binod@gmail.com","Binod", 1L),
			new Contact(6L, "bivas@gmail.com","Bivas", 2L),
			new Contact(7L, "ramesh@gmail.com","Ramesh", 3L),
			new Contact(8L, "rounick@gmail.com","Rounick", 4L),
			new Contact(9L, "sourav@gmail.com","Sourav", 1L),
			new Contact(10L, "souvik@gmail.com","Souvik", 3L),
			new Contact(11L, "sagnik@gmail.com","Sagnik", 4L)
			);

	@Override
	public List<Contact> getContacts(Long userid) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserid().equals(userid)).collect(Collectors.toList());
	}

}
