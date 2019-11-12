package com.example.assessment6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.assessment6","controller","repository"})
public class Assessment6Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment6Application.class, args);
	}

}
