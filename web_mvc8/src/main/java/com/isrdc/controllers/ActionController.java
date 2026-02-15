package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ActionController {
	
	@GetMapping("/act1")
	public String process(@RequestParam("nm")String name, @RequestParam("age")Integer age) {
		return "My Name Is: " + name + " And My Age Is: " + age;
	}
	
}
