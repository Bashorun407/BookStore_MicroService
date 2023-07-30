package com.akinnova.booktransactionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookTransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookTransactionServiceApplication.class, args);
	}

}
