package com.springjpa.userest.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springjpa.userest.entity.User;
import com.springjpa.userest.repository.UserRepository;

@Component
public class dataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		List<User> users = this.userRepository.findAll();

		if (users.isEmpty()) {
			this.createUser("Bruno", "bruno@email.com");
			this.createUser("Gracie", "Gracie@email.com");
			this.createUser("Gracie2", "Gracie2@email.com");
		}
		
		this.findByName("Bruno");
	}

	private void createUser(String name, String email) {
		User user = User.builder().name(name).email(email).build();

		this.userRepository.save(user);
	}
	
	private void findByName(String name) {
		User user = this.userRepository.findByName(name);
		System.out.println(user.getName());
	}

}
