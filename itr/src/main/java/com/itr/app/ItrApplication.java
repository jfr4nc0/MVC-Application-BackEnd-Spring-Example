package com.itr.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.itr.app.repositories.JugadorRepository;

@SpringBootApplication
public class ItrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItrApplication.class, args);
	}
}
