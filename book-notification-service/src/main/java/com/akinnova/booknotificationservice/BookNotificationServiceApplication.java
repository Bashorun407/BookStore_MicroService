package com.akinnova.booknotificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNotificationServiceApplication.class, args);
	}

}
