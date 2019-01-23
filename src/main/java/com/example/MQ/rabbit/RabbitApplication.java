package com.example.MQ.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitApplication {

	// this application is rabbit mq producer
	public static void main(String[] args) {
		SpringApplication.run(RabbitApplication.class, args);
	}

}

