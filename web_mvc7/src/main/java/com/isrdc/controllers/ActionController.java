package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActionController {
	
	@GetMapping("/ind")
	public String homePage() {
		System.out.println("Hello Duniya Waloon!!");
		return "index";
	}
	
	@GetMapping("/act1")
	public String infoPage(@RequestParam("nm")String name, Model model) {
		model.addAttribute("my_name", "Namaste! " + name);
		
		return "info";
	}
	
}
