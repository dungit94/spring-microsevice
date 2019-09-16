package com.viettel.myparking.loyaltyruleengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoyaltyRuleEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoyaltyRuleEngineApplication.class, args);
	}
}
