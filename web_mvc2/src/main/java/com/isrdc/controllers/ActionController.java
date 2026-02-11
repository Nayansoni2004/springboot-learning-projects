package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController {
	
//	http://localhost:9090/one
	@GetMapping("/one")
	public String requestOne(Model model) {
		
		model.addAttribute("message", "jai hoo .....");
		
		return "index";
	}
}
