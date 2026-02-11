package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department2")
public class A2Controller {

	// http://localhost:9090/department2/one
	@GetMapping("/one")
	public String requestOne(Model model) {
		
		model.addAttribute("msg", "A2Controller=>requestOne()");
		
		return "index";
	}
}
