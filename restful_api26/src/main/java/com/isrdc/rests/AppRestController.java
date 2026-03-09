package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;
import com.isrdc.exceptions.ExcepInfo;
import com.isrdc.exceptions.UnidentifiedUserException;

@RestController
public class AppRestController {
//	http://localhost:9090/pro?userId=90 -> use postman -> send req.
//	http://localhost:9090/pro?userId=101 -> use postman -> send req.
	@GetMapping("/pro")
	public ResponseEntity<UserDto> process(@RequestParam Integer userId) {
		if(userId > 100) {
			throw new UnidentifiedUserException("User with given id does not exist...");
		}else {
			UserDto dto = new UserDto();
			
			dto.setName("Rahul");
			dto.setEmail("rahul11@gmail.com");
			dto.setPhone("7828685828");
			dto.setAddress("london");

			return new ResponseEntity<>(dto, HttpStatus.OK);
		}
	}
	
	@ExceptionHandler(exception = UnidentifiedUserException.class)
	public ResponseEntity<ExcepInfo> userExcepHandler(UnidentifiedUserException excep) {
		ExcepInfo ex = new ExcepInfo();
		
		ex.setExcepCode("EX000099");
//		ex.setExcepDescription("Some PRoblem Occured...");
		ex.setExcepDescription("The Problem : " + excep.getMessage());
		ex.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
