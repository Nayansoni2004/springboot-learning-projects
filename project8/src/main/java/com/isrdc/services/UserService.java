package com.isrdc.services;

import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveUser() {
		User user = new User();
		
		user.setUserId(2);
		user.setName("hritik");
		user.setEmail("hritik@gmail.com");
		user.setPassword("22449");
		
		userRepo.save(user);
	}
	
}
