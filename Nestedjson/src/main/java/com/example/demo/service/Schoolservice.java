package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Profile;

import com.example.demo.entity.School;
import com.example.demo.repository.Repo;


@Service
public class Schoolservice {
	
	@Autowired
	Repo repo;
	

	
	
	public void add1(School s) {
		repo.save(s);
	}
	
	public List<School> data (){
		return(List<School>)repo.findAll();
		
	}
	
	public Optional<School> findbyid(int id){
		return repo.findById(id);
	}

}
