package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	//dependency injection
	private UserRepo userRepo;
	
	@Autowired
	private void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveUser() {
		User user = new User();
		
		user.setName("vera");
		user.setEmail("vera@gmail.com");
//		user.setPassword("om121");
		
		userRepo.save(user);
	}
	
}
