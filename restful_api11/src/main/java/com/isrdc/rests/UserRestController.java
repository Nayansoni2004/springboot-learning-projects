package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;
import com.isrdc.services.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userServ;
	
	//fetch all records
	@GetMapping("/show_all")
	public ArrayList<UserDto> showAllUsers() {
		ArrayList<UserDto> userDtos = userServ.collectAllUsers();
		
		return userDtos;
	}
	
	//insert record
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDto userDto) {
		
		userServ.saveUser(userDto);
		
		return "Done...";
	}
}
