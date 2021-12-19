package com.twitter.sharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PreferencesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreferencesServiceApplication.class, args);
	}

}
