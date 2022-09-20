package com.Ulearn.PackageService.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ulearn.PackageService.entity.PackageEntity;

@Repository
public interface PackageRepo extends JpaRepository<PackageEntity, Long> {
	
	
	@Query(value = "SELECT * FROM tbl_inst_package  WHERE CONCAT(PK_ID,INST_ID,PK_FNAME,IS_ACTIVE) LIKE %?1%",nativeQuery = true)
	public Page<PackageEntity> searching(Pageable pageable,String field);
	
	@Query(value = " SELECT * FROM tbl_inst_package  WHERE CONCAT(PK_ID,INST_ID,PK_FNAME) LIKE %?1%",nativeQuery = true)
	public List<PackageEntity> search(String field);
	
}
