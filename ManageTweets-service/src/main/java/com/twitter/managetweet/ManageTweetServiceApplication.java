package com.twitter.managetweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManageTweetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageTweetServiceApplication.class, args);
	}

}
