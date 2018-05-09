package com.usst.usstnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UsstnewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsstnewsApplication.class, args);
	}
}
