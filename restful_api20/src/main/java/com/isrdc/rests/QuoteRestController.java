package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.QuoteDto;
import com.isrdc.services.QuoteService;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteService qService;
	
	@GetMapping("/show")
	public ResponseEntity<QuoteDto> randomQuote() {
		
		QuoteDto dto = qService.fetchRandomQuote();
		
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
}
