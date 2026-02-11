package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController2 {
	//http://localhost:9090/two
	@GetMapping("/two")
	public String requestTwo(Model model) {
		
		model.addAttribute("message", "ActionController2=>requestTwo()");
		
		return "index";
	}
}
