package com.Ulearn.PackageService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Ulearn.PackageService.entity.PackageEntity;
import com.Ulearn.PackageService.exception.CustomException;
import com.Ulearn.PackageService.repository.PackageRepo;

@Service
public class PackageService {
	
	
	@Autowired 
	private PackageRepo packageRepo;
 	
	
	public String add(PackageEntity entity) {
		packageRepo.save(entity);
		return "Data Added Sucessfully";
	}
	
	
	public List<PackageEntity> view() {
		
		return packageRepo.findAll();
	}
	
	
	public String deleteById(Long pkId) {
		packageRepo.deleteById(pkId);
		return "Data Deleted Sucessfully";
	}
	
	public PackageEntity update (Long pkId,PackageEntity entity) {
		Optional<PackageEntity> id = packageRepo.findById(pkId);
		if(id.isEmpty()) {
			throw new CustomException("pkId not Found Exception");
		}else {
		 packageRepo.findById(pkId).get();
		 return packageRepo.save(entity);
	}
		
	}
	
	public Page<PackageEntity> findpagenation(Integer pageno, Integer pagesize,String sortBy,String field) {
		PageRequest p = PageRequest.of(pageno, pagesize, Sort.by(sortBy));
		 return packageRepo.findBypkName(p,field);
	
	
}
	
	
	public List<PackageEntity> search(Optional<String> field){
		return packageRepo.findByField(field);
		
	}
	
	

}