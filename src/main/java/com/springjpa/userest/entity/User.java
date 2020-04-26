package com.springjpa.userest.entity;

import java.util.Set;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity //Funciona para o mysql/h2/Oracle
@Document
@Builder
@NoArgsConstructor 
@AllArgsConstructor
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) //Funciona para o mysql/h2/Oracle
	 private String id;
	
	@Getter @Setter private String name;
	
	@Getter @Setter private String email;
	
//	@ManyToMany //Funciona para o mysql/h2/Oracle
	private Set<Role> roles;
}
