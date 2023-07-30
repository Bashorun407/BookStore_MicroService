package com.akinnova.bookidentityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookIdentityServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookIdentityServiceApplication.class, args);
	}

}
