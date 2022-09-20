package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User {
	
	
	
private Long userid;
private String name;
private String phone;

List<Contact> contacts;




public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(Long userid, String name, String phone) {
	super();
	this.userid = userid;
	this.name = name;
	this.phone = phone;
	this.contacts = contacts;
}

public Long getUserid() {
	return userid;
}

public void setUserid(Long userid) {
	this.userid = userid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public List<Contact> getContacts() {
	return contacts;
}

public void setContacts(List<Contact> contacts) {
	this.contacts = contacts;
}



	
}
