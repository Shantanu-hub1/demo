package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String department;
	private String experience;
	
	@ManyToOne
	private School school;
	
	
	public Profile(int id, String department, String experience, School school) {
		super();
		this.id = id;
		this.department = department;
		this.experience = experience;
		this.school = school;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Profile(int id,String department, String experience) {
		super();
		this.department = department;
		this.experience = experience;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
