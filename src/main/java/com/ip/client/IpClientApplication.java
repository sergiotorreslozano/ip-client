package com.ip.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class IpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpClientApplication.class, args);
	}
}
