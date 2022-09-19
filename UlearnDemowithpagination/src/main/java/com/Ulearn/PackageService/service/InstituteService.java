package com.Ulearn.PackageService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Ulearn.PackageService.entity.InstituteEntity;
import com.Ulearn.PackageService.repository.InstitutesRepository;

@Service
public class InstituteService {
	
	@Autowired private InstitutesRepository repository;
	
	
	
	public String insAdd(InstituteEntity entity) {
		repository.save(entity);
		return "Institute Added";
	}
	
	public List<InstituteEntity>  findall(){
		return repository.findAll();
	}
	
	
	public Optional<InstituteEntity> findbypkId( Long instId){
		return repository.findById(instId);
	}

	public String delete(Long instId) {
		repository.deleteById(instId);
		return "Data deleted Sucessfully";
		
	}
	
	public List<InstituteEntity> find(){
		return repository.findAll();
	}
}
