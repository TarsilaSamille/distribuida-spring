package com.distribuida.serverless;

import java.util.function.Function;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ServerlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerlessApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase2() {
		return new Exchange();
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<Message<String>, Integer> uppercaseMessage() {
		return value -> value.getPayload().toUpperCase().length();
	}

	@Bean
	public Function<Flux<String>, Flux<String>> lowercase() {
		return flux -> flux.map(value -> value.toLowerCase());
	}

	@Bean
	public Supplier<String> hello() {
		return () -> "hellou";
	}
}
