package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActionController {
	
//	http://localhost:9898/one
	@GetMapping("/one")
	public ModelAndView requestOne() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Time Up .....");
		
		mav.setViewName("index");
		
		return mav;
	}
	
//	http://localhost:9898/two
	@GetMapping("/two")
	public ModelAndView requestTwo() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Time start...");
		
		mav.setViewName("info");
		
		return mav;
	}
}
