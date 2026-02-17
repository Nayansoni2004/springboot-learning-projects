package com.isrdc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.dtos.UserDto;

@Controller
public class ActionController {
	
	@GetMapping("/act")
	public String showRecords(Model model) {
		ArrayList<UserDto> usersList = new ArrayList<>();
		
		usersList.add(new UserDto("Raju", 2, 'M', "SRIT"));
		usersList.add(new UserDto("chutki", 7, 'F', "Global"));
		usersList.add(new UserDto("jaggu", 4, 'O', "GGCT"));
		usersList.add(new UserDto("Bheem", 9, 'M', "JEC"));
		usersList.add(new UserDto("Kaliya", 9, 'M', "HEC"));
		usersList.add(new UserDto("Indumati", 6, 'F', "GGITS"));
		
		model.addAttribute("usersList", usersList);
		
		return "users";
	
	}
	
}
