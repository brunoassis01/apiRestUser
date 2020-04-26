package com.springjpa.userest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springjpa.userest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);
	
	@Query("select u from User u where u.email like %?1%")
	User findBySomeEmail(String email);
}
