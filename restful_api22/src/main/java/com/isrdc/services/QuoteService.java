package com.isrdc.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.dtos.QuoteDto;

import reactor.core.publisher.Mono;

@Service
public class QuoteService {
	public Mono<QuoteDto> fetchRandomQuote(Integer id) {
		String url =  "https://dummyjson.com/quotes/{id}";
		
		Mono<QuoteDto> mono =  WebClient
										.create()
										.get()
										.uri(url,id)
										.retrieve()
										.bodyToMono(QuoteDto.class);
		
		return mono;
	}
}
