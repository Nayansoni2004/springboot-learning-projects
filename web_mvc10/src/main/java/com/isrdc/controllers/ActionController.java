package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isrdc.dtos.UserDto;

@Controller
public class ActionController {
	
	@GetMapping("/show_form")
	public String showForm(Model model) {
		
		UserDto userDto = new UserDto();
		
		model.addAttribute("user", userDto);
		
		return "form";  //view page
	}
	
	@PostMapping("/save")
	@ResponseBody
	public String handleForm(/*@RequestBody*/ UserDto userDto) {
		
		System.out.println(userDto);
		
		return userDto.toString();
	}
	
	
}
