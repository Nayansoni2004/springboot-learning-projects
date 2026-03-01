package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class RestfulApi19Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApi19Application.class, args);
		
		randomQuotes();
	}
	
	//bring dummy json data from internet
	private static void randomQuotes() {
		String url = "https://dummyjson.com/quotes/random";
		
		WebClient webClient = WebClient.create();
		
		Mono<QuoteDto> mono = webClient
										.get()
										.uri(url)
										.retrieve()
										.bodyToMono(QuoteDto.class);
		
		QuoteDto dto = mono.block();
		System.out.println(dto);
		
		System.out.println("--------------1---------------");
		System.out.println("--------------2---------------");
		System.out.println("--------------3---------------");
	}

}
