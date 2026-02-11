package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/department1")
public class A1Controller {
	
	// http://localhost:9090/department1/one
	@GetMapping("/one")
	public ModelAndView requestOne() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "A1Controller=>requestOne() *******");
		
		mav.setViewName("index");
		
		return mav;
	}
}
