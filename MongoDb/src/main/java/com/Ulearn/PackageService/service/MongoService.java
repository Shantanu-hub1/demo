package com.Ulearn.PackageService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ulearn.PackageService.entity.MongoEntity;
import com.Ulearn.PackageService.repository.MongoRepo;

@Service
public class MongoService {
	
	@Autowired 
	private MongoRepo repository;

	public String add(MongoEntity entity) {
		
		repository.save(entity);
		return "mongo data added";
		
	}

	public Optional<MongoEntity> findbyid(Integer id) {
		return repository.findById(id);
		
		
	}

	public List<MongoEntity> findbybankBalance(Integer bankBalance) {
		
		return repository.findBybankBalance(bankBalance);
	}

	public List<MongoEntity> getMongoEntitybyAddress(String pin) {
		
		return repository.getMongoEntitybyAddress(pin);
	}

	public List<MongoEntity> getMongoEntitybyAddresscity(String city) {
		
		return repository.getMongoEntitybyAddresscity(city);
	}

	public String DeleteById(Integer id) {
		 repository.deleteById(id);
		return "Mongo deleted Sucessfully";
		
		
	}
	
	public List<MongoEntity> findall(){
		return repository.findAll();
	}


	
	
	

}
