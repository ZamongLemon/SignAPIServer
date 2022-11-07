package com.puhu17.signupapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SignupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupApiApplication.class, args);
	}

}
