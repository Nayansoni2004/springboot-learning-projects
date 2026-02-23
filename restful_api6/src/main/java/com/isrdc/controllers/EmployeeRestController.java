package com.isrdc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.EmployeeDto;

@RestController
public class EmployeeRestController {
	
	@GetMapping(value="/show", produces = "application/json")
	public ResponseEntity<String> showRecord() {
//		normal java object
		EmployeeDto employeeDto = new EmployeeDto("Rahul Yadav", 21, "TCS", 20000f);
		
//		Java Object → JSON String ->manual conversion
		String resp = new Gson().toJson(employeeDto); 
		
		return new ResponseEntity<String>(resp, HttpStatus.ACCEPTED);
		
	}
}
