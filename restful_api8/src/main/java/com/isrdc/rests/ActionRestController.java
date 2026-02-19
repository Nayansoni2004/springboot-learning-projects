package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	//at a time application can be consumer as well as provider...
//	http://localhost:9090/pro/347
	@GetMapping(value="/pro/{rank}", produces = "text/plain")
	public String process(@PathVariable Integer rank) {
		System.out.println("Everything running good " + rank);
		return "Done " + rank;
	}
	
//	http://localhost:9090/info/rahul/21/100/true
	@GetMapping("/info/{name}/{age}/{marks}/{flag}")
	public String info(@PathVariable String name, @PathVariable Integer age, @PathVariable Float marks, @PathVariable Boolean flag) {
		return "Ho..Gya " + name + " - " + age + " - " + marks + " - " + flag;
	}
	
}
