package com.ebarrab.cliente_rest;

import com.ebarrab.cliente_rest.model.Joke;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClienteRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienteRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Joke joke = restTemplate.getForObject(
                    "https://api.chucknorris.io/jokes/random", Joke.class);
        };
    }


}