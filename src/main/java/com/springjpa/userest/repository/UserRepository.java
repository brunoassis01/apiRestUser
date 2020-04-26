package com.springjpa.userest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springjpa.userest.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{
	
	User findByName(String name);
}
