package com.springjpa.userest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.userest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
