package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActionController {
	//http://localhost:9090/one
	@GetMapping("/one")
	public ModelAndView requestOne() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "ActionController=>requestOne()");
		
		mav.setViewName("index");
		
		return mav;
	}

}
