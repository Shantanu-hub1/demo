package com.Ulearn.PackageService.repository;

import com.Ulearn.PackageService.entity.MongoEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface MongoRepo extends MongoRepository<MongoEntity, Integer> {

	List<MongoEntity> findBybankBalance(Integer bankBalance);
	@Query("{'Address.pin':?0}")
	List<MongoEntity>getMongoEntitybyAddress(String pin);
	
	@Query("{'Address.city':?0}")
	List<MongoEntity> getMongoEntitybyAddresscity(String city);

}
