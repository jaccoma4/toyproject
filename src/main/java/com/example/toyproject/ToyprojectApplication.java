package com.example.toyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ToyprojectApplication {

	@RequestMapping
	String home(){
		return "main";
	}

	public static void main(String[] args) {
		SpringApplication.run(ToyprojectApplication.class, args);
	}

}
