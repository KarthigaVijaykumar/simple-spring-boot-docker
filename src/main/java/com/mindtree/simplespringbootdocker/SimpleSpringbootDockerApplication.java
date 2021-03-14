package com.mindtree.simplespringbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringbootDockerApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Dockerizing first simple spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootDockerApplication.class, args);
	}

}
