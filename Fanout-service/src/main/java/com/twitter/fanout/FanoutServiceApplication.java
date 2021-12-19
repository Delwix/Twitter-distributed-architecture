package com.twitter.fanout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FanoutServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanoutServiceApplication.class, args);
	}

}
