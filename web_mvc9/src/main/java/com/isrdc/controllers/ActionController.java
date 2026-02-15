package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActionController {
	
	//http://localhost:9090/pro/nato
	//homework -> http://localhost:9090/study/2/11     hint: volumne:2 chapter:11
	@GetMapping("/pro/{group}")
	public String process(@PathVariable("group")String group, Model model) {
		
		model.addAttribute("msg", "Hello! " + group);
		
		return "info";
	}
	
	
	@GetMapping("/study/{vol}/{chap}")
	@ResponseBody
	public String showInfo(@PathVariable("vol") Integer volume, @PathVariable("chap") Integer chapter) {
		
		return "Volume: " + volume + " Chapter: " + chapter;
	}
	
	
}
