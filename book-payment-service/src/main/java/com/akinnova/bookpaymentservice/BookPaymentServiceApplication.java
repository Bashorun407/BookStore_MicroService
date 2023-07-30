package com.akinnova.bookpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookPaymentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookPaymentServiceApplication.class, args);
	}

}
