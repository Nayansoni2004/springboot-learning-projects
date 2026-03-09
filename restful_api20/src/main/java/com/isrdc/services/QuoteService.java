package com.isrdc.services;

import java.util.function.Consumer;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.dtos.QuoteDto;

@Service
public class QuoteService {
	public QuoteDto fetchRandomQuote() {
		String url = "https://dummyjson.com/quotes/random"; //it will return single response at a time
		WebClient webClient = WebClient.create();
		
		QuoteDto dto = null;
		
		webClient
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(QuoteDto.class)
//				.subscribe(new X());
//				.subscribe(dto -> System.out.println(dto + " * "));
				.subscribe(obj -> handleDto(obj));
		
		System.out.println("------------1--------------");
		System.out.println("------------2--------------");
		System.out.println("------------3--------------");
		
		return dto;
	}
	
	private void handleDto(QuoteDto dto) {
		System.out.println(dto);
	}
}

//dto -> System.out.println(dto + " - ");

//class X implements Consumer<QuoteDto> {
//	public void accept(QuoteDto dto) {
//		System.out.println(dto + " - ");
//	}
//}
