package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class BootCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudGatewayApplication.class, args);
	}

}
