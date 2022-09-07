package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface Userrepository extends JpaRepository<User, Integer>{

	@Query(value="select * from user where email= ?1 and password=?2",nativeQuery = true)
	public Optional<User> login(String email,String password);
	
}
