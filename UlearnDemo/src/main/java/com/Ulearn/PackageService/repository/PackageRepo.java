package com.Ulearn.PackageService.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ulearn.PackageService.entity.PackageEntity;

@Repository
public interface PackageRepo extends JpaRepository<PackageEntity, Long> {
	
//	@Query(value="SELECT *  FROM tbl_inst_package WHERE PK_ID or INST_ID or PK_TYPE or PK_NAME or PK_FNAME or PK_NUSERS or PK_VALIDITY_TYPE or PK_VALIDITY_NUM or PK_CDATE or PK_COMMENT or PARENT_ID or IS_ACTIVE or IS_DELETED or PK_STATUS or CREATED_ON or UPDATED_ON Like %?%",nativeQuery = true)
//	public Page<PackageEntity> findByField(Pageable pageable,String field);

	@Query("SELECT p FROM PackageEntity p WHERE CONCAT(p.pkId,p.pkCdate,p.pkFname,p.pkNusers,p.pkStatus,p.pkValidityType) LIKE %?1%")
	public Page<PackageEntity> findBypkName(PageRequest p, String field);

	@Query("SELECT p FROM PackageEntity p WHERE CONCAT(p.pkId,p.pkCdate,p.pkFname,p.pkNusers,p.pkStatus,p.pkValidityType,p.pkType,p.pkName) LIKE %?1%")
	public List<PackageEntity> findByField(Optional<String> field);
    
	

}
