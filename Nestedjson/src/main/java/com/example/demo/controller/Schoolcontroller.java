package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.School;

import com.example.demo.repository.Repo;
import com.example.demo.service.Schoolservice;

@RestController
public class Schoolcontroller {
	
	@Autowired
	Schoolservice sc;
	
	@Autowired
	Repo repo;
	
	
	
	@PostMapping("/add")
	public String add(@RequestBody School s  ) {
	
		sc.add1(s);
		return "Data added Sucessfully";
		
	}
	
	@GetMapping("/findall")
	public List<School> findall(){
		return sc.data();
	
	

}
	@GetMapping("/findbyid/{id}")
	public Optional<School> find(@PathVariable int id){
		  return sc.findbyid(id);
		
	}
	
	@GetMapping("/findbydepartment/{department}")
	public List<School> findbydepartment(@PathVariable(value="department") String department){
		return repo.findbyDepartment(department);
	}

}
