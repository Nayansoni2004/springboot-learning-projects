package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;
import com.isrdc.services.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userServ;
	
	//delete record
//	http://localhost:9090/delete/2 -> postman select method delete and -> send req
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer userId) {
		
		userServ.deleteUser(userId);
		
		return "User Deleted";
	}
	
	//update record
//	http://localhost:9090/update -> postman select method put,& go to body tag select raw->json then enter json record with existing userId, name, age, rating.
//	setting userId is mandatory otherwise new record will get insert
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDto userDto) {
		userServ.updateUser(userDto);
		return "User Update Ho Gya!!";
	}
	
	//fetch all records
//	http://localhost:9090/show_all <-select method as GET in postman and click send
	@GetMapping("/show_all")
	public ArrayList<UserDto> showAllUsers() {
		ArrayList<UserDto> userDtos = userServ.collectAllUsers();
		
		return userDtos;
	}
	
	//insert record
//	http://localhost:9090/save <-select method is POST in postMan & in body tab select raw, then select JSON, then enter a Json String -> click send
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDto userDto) {
		
		userServ.saveUser(userDto);
		
		return "Done...";
	}
}
