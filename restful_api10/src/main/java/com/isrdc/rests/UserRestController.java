package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.UserDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserRestController {
	
//	http://localhost:9090/pro?json={"name":"rahul","age":24,"address":"jabalpur 482002","phone":"7828496626"}
	@GetMapping(value="/pro", produces="text/plain")
	public String pro(String json) {      //not working
		Gson gson = new Gson();
		
		UserDto userDto = gson.fromJson(json, UserDto.class);
		
		System.out.println(userDto);
		
		return userDto.toString();
	}
	
//	http://localhost:9090/info?json={\"name\":\"rahul\",\"age\":24,\"address\":\"jabalpur 482002\",\"phone\":\"7828496626\"}
	@GetMapping(value="/info", produces="text/plain")
	public String info(HttpServletRequest request) { //not working
		String json = request.getParameter("json");
		Gson gson = new Gson();
		
		UserDto userDto = gson.fromJson(json, UserDto.class);
		
		System.out.println(userDto);
		
		return userDto.toString();
	}
	
//	http://localhost:9090/process
	@PostMapping(value="/process", produces="text/plain", consumes="application/json")
	public String process(@RequestBody UserDto userDto) { //working
		
		System.out.println(userDto);
		
		return "Done";
	}
	
}
