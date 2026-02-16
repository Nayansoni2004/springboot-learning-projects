package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.dtos.UserDto;

@Controller
public class ActionController {
	
	@GetMapping("/show_info")
	public String showInfo(Model model) {
		UserDto userDto = new UserDto();
		
		userDto.setName("kamlesh kumar");
		userDto.setAge(17);
		userDto.setMarks(78.56f);
		
		model.addAttribute("user", userDto);
		
		return "info";
	}
}
