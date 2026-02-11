package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
//@RestController
public class ActionController {
	
	//this implementation is used when B2B applications are developed... sending JSON data
	@GetMapping("/one")
	public String requestOne() {
		
		return "Time Up... !!"; //its a Http Response body, not a view page name...
	}
	
}
