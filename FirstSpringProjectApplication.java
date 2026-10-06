package com.example.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
// CommandLineRunner is an interface used to indicate that a bean should run when it is contained within a SpringApplication.
//  It can be used to execute code after the Spring Boot application has started.
public class FirstSpringProjectApplication implements CommandLineRunner {
	@Autowired 
	hello hw;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		hw.display();
	}
}
