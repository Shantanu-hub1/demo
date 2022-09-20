package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String phone;
	private String city;
	
	
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Details(int id, String phone, String city) {
		super();
		this.id = id;
		this.phone = phone;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	

}
