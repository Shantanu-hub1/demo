package com.Ulearn.PackageService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ulearn.PackageService.entity.PackageEntity;
import com.Ulearn.PackageService.exception.CustomException;
import com.Ulearn.PackageService.service.PackageService;



@RestController
public class PackageController {
	
	
	@Autowired 
	private PackageService packageService;
	
	@GetMapping("/home")
	public String home() {
		return "hi home Page";
	}
	
	@PostMapping("/add")
	public String save(@RequestBody PackageEntity entity) {
		try {
		return packageService.add(entity);
	}catch(Exception e){
		throw new CustomException(e.getMessage());
		
	}
	}
	@GetMapping("/get")
	public List<PackageEntity>get(){
		try {
		return packageService.view();
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	@DeleteMapping("/delete/{pkId}")

	public String delete(@PathVariable Long pkId) {
		try {
		return packageService.deleteById(pkId);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	@PutMapping("/update/{pkId}")
	public PackageEntity updateById(@PathVariable Long pkId,@RequestBody PackageEntity entity) {
		try {
		return packageService.update(pkId,entity);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	
	
	}
}
