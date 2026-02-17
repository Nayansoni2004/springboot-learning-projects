package com.isrdc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.UserDto;

@RestController
public class ActionRestController {
	
	@GetMapping("/pro")
	public String process() {
		Gson gson = new Gson();
		
		UserDto userDto = new UserDto();
		userDto.setName("Virat");
		userDto.setAge(32);
		userDto.setCollege("Engineering of Cricket");
		userDto.setMarks(70.40f);
		
		//serialization: converting Object into Json
		return gson.toJson(userDto);
	}
	
}
