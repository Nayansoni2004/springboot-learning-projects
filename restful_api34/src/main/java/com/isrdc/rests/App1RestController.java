package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1RestController {
	@GetMapping("/aaa")
	public String aaa() {
		return "inside aaa...";
	}
	@GetMapping("/bbb")
	public String bbb() {
		return "inside bbb...";
	}
}
