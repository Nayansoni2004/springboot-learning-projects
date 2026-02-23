package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;

@RestController
public class UserRestController {
	
//	http://localhost:9090/show_all -> test using postman select method get -> send req. -> resp is xml you will get, if you remove produces, then you will get json string.
//	http://localhost:9090/show_all -> test using chrome browser type url & enter -> response is xml you will get  
	@GetMapping(value="/show_all", produces={"application/xml", "application/json"}) //produces me hum content type batate h jese text/plain
	public ArrayList<UserDto> showUsers() {
		ArrayList<UserDto> userDtos = new ArrayList<>();
		
		userDtos.add(new UserDto("rahul", "rahul@gmail.com", "7879345673", "jabalpur", 21, 4.1f));
		userDtos.add(new UserDto("aniket", "aniket@gmail.com", "9898095023", "bhopal", 22, 3.2f));
		userDtos.add(new UserDto("arvind", "arvind@gmail.com", "7856844227", "indore", 21, 6.6f));
		
		return userDtos;
	}
	
//	http://localhost:9090/save_user -> test using postman ->method post -> body tab ->select raw->json and type json string then -> send req. -> response will print in sts console.
//	{ <-type this json string in postman
//	    "name":"om",
//	    "email":"om@gmail.com",
//	    "phone":"7999823016",
//	    "address":"narsinghpur",
//	    "age":20,
//	    "rating":4.3
//	}
	
//	http://localhost:9090/save_user -> test using postman ->method post -> body tab ->select raw->xml and type xml record using tags then -> send req. -> response will print in sts console.
//	<UserDto> <-xml raw data enter in postman
//    		<name>gandhi</name>
//    		<email>gandhi@gmail.com</email>
//    		<phone>9090909090</phone>
//    		<address>gujrat</address>
//    		<age>32</age>
//    		<rating>4.6</rating>
//    </UserDto>
	@PostMapping(value="/save_user", consumes={"application/xml", "application/json"})
	public String saveUser(@RequestBody UserDto userDto) {
		System.out.println(userDto);
		return "User Saved Successfully!";
	}
	
}
