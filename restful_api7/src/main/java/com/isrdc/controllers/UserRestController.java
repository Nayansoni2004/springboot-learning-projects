package com.isrdc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;

@RestController
public class UserRestController {
//	Auto Serialization using Jackson
	//postman resp. -> 200 status code
	@GetMapping("/show")
	public UserDto showUser() {
		UserDto userDto = new UserDto("Eeshan Kishan", 32, "eeshan@gmail.com", "7828456632");
		
		return userDto;
	}
	
//	HTTP response control
//	postman resp. -> 202 status code
	@GetMapping(value="/view", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDto> viewUser() {
		UserDto userDto = new UserDto("Hardik Pandya", 34, "pandya@gmail.com", "888856632");
		
		return new ResponseEntity(userDto, HttpStatus.ACCEPTED);
	}
	
//	Collection serialization -> multiple objects ko json array me convert krna
//	postman resp. -> 200 ok status code
	@GetMapping("/show_all")
	public ResponseEntity<List<UserDto>> showAllUsers() {
		UserDto u1 = new UserDto("Vaibhav Suryawanshi", 14, "vs@gmail.com", "1234567890");
		UserDto u2 = new UserDto("Tilak Verma", 20, "tilak@gmail.com", "1234567889");
		UserDto u3 = new UserDto("Rohit Sharma", 38, "rohit@gmail.com", "8845567890");
		UserDto u4 = new UserDto("MS Dhoni", 22, "ms@gmail.com", "1234567890");
		
		ArrayList<UserDto> list = new ArrayList<>();
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
//	ResponseEntity is not mandatory, spring automatically send body->json & status->200 
	@GetMapping("/view_all")
	public List<UserDto> viewAllUsers() {
		UserDto u1 = new UserDto("Vaibhav Suryawanshi", 14, "vs@gmail.com", "1234567890");
		UserDto u2 = new UserDto("Tilak Verma", 20, "tilak@gmail.com", "1234567889");
		UserDto u3 = new UserDto("Rohit Sharma", 38, "rohit@gmail.com", "8845567890");
		UserDto u4 = new UserDto("MS Dhoni", 22, "ms@gmail.com", "1234567890");
		UserDto u5 = new UserDto("Juspreet Bumhra", 27, "bumhra@gmail.com", "7878676767");
		
//		ArrayList<UserDto> list = new ArrayList<>();
//		
//		list.add(u1);
//		list.add(u2);
//		list.add(u3);
//		list.add(u4);
		
		List<UserDto> list = Arrays.asList(u1, u2, u3, u4, u5);
		
		return list;
	}
}
