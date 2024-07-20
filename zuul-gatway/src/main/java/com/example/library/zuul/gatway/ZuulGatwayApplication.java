package com.example.library.zuul.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuulGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatwayApplication.class, args);
	}

}
