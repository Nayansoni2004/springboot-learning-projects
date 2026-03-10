package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2RestController {
	@GetMapping("/ccc")
	public String ccc() {
		return "inside ccc...";
	}
	@GetMapping("/ddd")
	public String ddd() {
		return "inside ddd...";
	}
}
