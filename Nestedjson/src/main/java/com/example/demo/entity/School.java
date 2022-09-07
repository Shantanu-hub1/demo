package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="school_id",referencedColumnName = "id")
	private List<Profile> profile;



	public School(int id, List<Profile> profile) {
		super();
		this.id = id;
		this.profile = profile;
	}

	public List<Profile> getProfile() {
		return profile;
	}

	public void setProfile(List<Profile> profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

     
	

}
