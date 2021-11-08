package com.company.quizappconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class QuizAppConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppConfigServiceApplication.class, args);
	}

}
