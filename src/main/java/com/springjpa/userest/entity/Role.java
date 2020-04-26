package com.springjpa.userest.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Builder
@NoArgsConstructor 
@AllArgsConstructor
public class Role {

	@Id
	@Getter private Long id;
	
	@Getter @Setter private String name;
	
}
