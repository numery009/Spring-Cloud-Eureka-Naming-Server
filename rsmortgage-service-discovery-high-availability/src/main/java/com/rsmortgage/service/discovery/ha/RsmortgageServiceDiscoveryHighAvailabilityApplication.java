package com.rsmortgage.service.discovery.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RsmortgageServiceDiscoveryHighAvailabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsmortgageServiceDiscoveryHighAvailabilityApplication.class, args);
	}
}
