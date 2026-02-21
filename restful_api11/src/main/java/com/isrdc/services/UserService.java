package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.UserDto;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	//method to retrieve all records
	public ArrayList<UserDto> collectAllUsers() {
		List<User> users = userRepo.findAll();
		ArrayList<UserDto> userDtos = new ArrayList<>();
		
		for(User next : users) {
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(next, userDto);
			userDtos.add(userDto);
		}
		
		return userDtos;
	}
	
	//method to save data
	public void saveUser(UserDto userDto) {
		User user = new User();
		
		BeanUtils.copyProperties(userDto, user);
		
		userRepo.save(user);
	}
}
