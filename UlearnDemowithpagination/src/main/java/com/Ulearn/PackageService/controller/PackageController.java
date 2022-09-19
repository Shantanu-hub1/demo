package com.Ulearn.PackageService.controller;

import java.util.List;
import java.util.Optional;import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ulearn.PackageService.entity.InstituteEntity;
import com.Ulearn.PackageService.entity.PackageEntity;
import com.Ulearn.PackageService.exception.CustomException;
import com.Ulearn.PackageService.service.InstituteService;
import com.Ulearn.PackageService.service.PackageService;



@RestController
public class PackageController {
	
	
	@Autowired 
	private PackageService packageService;
	
	
	
	@Autowired private InstituteService instituteService;
	
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
	
	@PostMapping("/InsAdd")
	public String InsAdd(@RequestBody InstituteEntity entity) {
		return instituteService.insAdd(entity);
	}
	@GetMapping("/findbyid/{instId}")
	public Optional<InstituteEntity> findbyid(@PathVariable Long instId){
		return instituteService.findbypkId(instId);
		
	}
	@DeleteMapping("/deletebyid/{instId}")
	public String deletebyid(@PathVariable Long instId) {
		return instituteService.delete(instId);
	}
	
	@GetMapping("/findinstitutes")
	public List<InstituteEntity> findinstitutes(){
		return instituteService.find();
	}
	
	@GetMapping("/pagination/{pageno}/{pagesize}")
	public Page<PackageEntity> pagination(@PathVariable Integer pageno,@PathVariable Integer pagesize){
		return packageService.pagination(pageno, pagesize);
	}
	
	@GetMapping("/searching/{field}")
	public Page<PackageEntity> searching(@RequestParam Integer pageno,@RequestParam Integer pagesize,@PathVariable String field){
		
		return packageService.searching(pageno, pagesize, field);
	}
	
	@GetMapping("/search/{field}")
	public List<PackageEntity> search(@PathVariable String field){
		return packageService.search(field);
	}
	
	
	
}
