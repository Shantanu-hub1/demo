package com.Ulearn.PackageService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class MongoEntity {
	@Id
	private Integer id ;
	private String name ;
	private Integer bankBalance ;
	private Integer age ;
	private Address  address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(Integer bankBalance) {
		this.bankBalance = bankBalance;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MongoEntity [id=" + id + ", name=" + name + ", bankBalance=" + bankBalance + ", age=" + age + "]";
	}
	public MongoEntity(Integer id, String name, Integer bankBalance, Integer age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.bankBalance = bankBalance;
		this.age = age;
		this.address = address;
	}
	public MongoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	   

}
