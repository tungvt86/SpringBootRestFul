package com.spring.boot.rest.ful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.spring.boot.rest.ful"})
public class SpringBootRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestFulApplication.class, args);
	}
}
