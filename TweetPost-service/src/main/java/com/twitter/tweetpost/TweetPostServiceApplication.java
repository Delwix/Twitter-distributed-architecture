package com.twitter.tweetpost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TweetPostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetPostServiceApplication.class, args);
	}

}
