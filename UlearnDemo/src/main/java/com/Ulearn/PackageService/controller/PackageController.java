package com.Ulearn.PackageService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		return packageService.add(entity);
	
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
	
	@GetMapping("/pagenation/{field}")
	public Page<PackageEntity> paging(
			@RequestParam(value = "pageno",defaultValue ="0",required = false) Integer pageno,
			@RequestParam(value = "pagesize",defaultValue ="10",required = false) Integer pagesize,
			@RequestParam(value = "sortBy",defaultValue ="pkId",required = false) String sortBy,
			@PathVariable("field") String field
			){
		try {
		return packageService.findpagenation(pageno, pagesize,sortBy,field);
		
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
}
//	@GetMapping("/find/{pageno}/{pagesize}/{field}")
//	public Page<PackageEntity> findByfield(@PathVariable String field,@PathVariable Integer pageno,@PathVariable Integer pagesize){
//		try {
//		return packageService.findByfield(pageno, pagesize, field);
//		
//	}catch (Exception e) {
//		throw new CustomException(e.getMessage());
//	}
	
	@GetMapping("/search/{field}")
	public List<PackageEntity> searchBy(@PathVariable Optional<String> field){
		return packageService.search(field);
		
	}
//	@PostMapping("/suspended/{pkId}")
//	public PackageLogEntity suspended(@PathVariable long pkId,@RequestBody PackageLogEntity entity) {
//		try {
//			return this.packageService.suspend(pkId, entity);
//		}catch (Exception e) {
//			throw new CustomException(e.getMessage());
//		}
//		
//		
//	}
}
