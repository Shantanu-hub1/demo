package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.School;

@RestController
public interface Repo extends JpaRepository<School,Integer>{
	
	@Query(value="select school.id,school.profile_id,profile.id,profile.department,profile.experience from school inner join profile  on profile.id=school.profile_id where department =?", nativeQuery=true)
	public List<School> findbyDepartment(String department);

}
