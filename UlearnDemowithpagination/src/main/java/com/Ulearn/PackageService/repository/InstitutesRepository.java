package com.Ulearn.PackageService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ulearn.PackageService.entity.InstituteEntity;

@Repository
public interface InstitutesRepository  extends JpaRepository<InstituteEntity, Long>{

}
