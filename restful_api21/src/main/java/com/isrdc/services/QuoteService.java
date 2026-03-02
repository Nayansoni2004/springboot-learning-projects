package com.isrdc.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.dtos.QuoteDto;

import reactor.core.publisher.Mono;

@Service
public class QuoteService {
	public Mono<QuoteDto> fetchRandomQuote() {
		String url =  "https://dummyjson.com/quotes/random";
		
		Mono<QuoteDto> mono =  WebClient
										.create()
										.get()
										.uri(url)
										.retrieve()
										.bodyToMono(QuoteDto.class);
		
		return mono;
	}
}
