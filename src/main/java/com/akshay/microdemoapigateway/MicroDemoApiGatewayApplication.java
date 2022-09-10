package com.akshay.microdemoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroDemoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDemoApiGatewayApplication.class, args);
	}

}
