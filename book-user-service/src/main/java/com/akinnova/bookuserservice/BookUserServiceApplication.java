package com.akinnova.bookuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookUserServiceApplication.class, args);
	}

}
