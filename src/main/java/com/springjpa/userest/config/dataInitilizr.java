package com.springjpa.userest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springjpa.userest.entity.User;
import com.springjpa.userest.repository.UserRepository;

@Component
public class dataInitilizr implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		User user = User.builder().name("Bruno").email("bruno@email.com").build();

		this.userRepository.save(user);
	}

}
