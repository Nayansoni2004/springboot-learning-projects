package com.isrdc.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Aadhar;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public void saveUser() {
		Aadhar aadhar = new Aadhar();
		
		aadhar.setAadharNumber("A56R3889");
		aadhar.setIssueDate(LocalDate.now());
		aadhar.setExpiryDate(LocalDate.now().plusYears(5));
		
		User user = new User();
		
		user.setName("Manoj Mishra");
		user.setAge(32);
		user.setEmail("manoj@gmail.com");
		user.setAddress("jabalpur");
		
		user.setAadhar(aadhar);
		aadhar.setUser(user);
		
		userRepo.save(user);
	}
}
