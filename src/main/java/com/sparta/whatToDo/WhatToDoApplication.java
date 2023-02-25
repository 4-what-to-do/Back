package com.sparta.whatToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatToDoApplication.class, args);
	}

}
