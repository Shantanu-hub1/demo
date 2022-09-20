package com.Ulearn.PackageService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ulearn.PackageService.entity.MongoEntity;
import com.Ulearn.PackageService.exception.CustomException;
import com.Ulearn.PackageService.service.MongoService;

@RestController
public class MongoController {
	
	
	@Autowired
	private MongoService mongoService;

	@GetMapping("/hi")
	public String hi() {
		return "hi i am bimal";
	}
	
	@PostMapping("/add")
	public String add(@RequestBody MongoEntity entity) {
		try {
		return mongoService.add(entity);
	}catch (Exception e) {
		throw new  CustomException(e.getMessage());
	}
	}
	@GetMapping("/findbyid/{id}")
	public Optional<MongoEntity> findbyid(@PathVariable Integer id){
		try {
		return mongoService.findbyid(id);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	@GetMapping("/findbyBankBalance/{bankBalance}")
	public List<MongoEntity> findbybankBalance(@PathVariable (value="bankBalance")Integer bankBalance){
		try {
		return mongoService.findbybankBalance(bankBalance);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	@GetMapping("/getMongoEntitybyAddress/{pin}")
	public List<MongoEntity>getMongoEntitybyAddress(@PathVariable (value = "pin") String pin){
		try {
		return mongoService.getMongoEntitybyAddress(pin);
		
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	
	@GetMapping("/getMongoEntitybyAddresscity/{city}")
	public List<MongoEntity> getMongoEntitybyAddresscity(@PathVariable (value = "city")String city){
		//String x=city.toLowerCase();
		return mongoService.getMongoEntitybyAddresscity(city);
	}
	
	@DeleteMapping("/DeleteById/{id}")
	public String DeleteById(@PathVariable Integer id) {
		try {
		return mongoService.DeleteById(id);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
}
	
	@GetMapping("/listofdata")
	public List<MongoEntity> listofdata(){
		try {
			return mongoService.findall();
		}catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
	}
	
}
