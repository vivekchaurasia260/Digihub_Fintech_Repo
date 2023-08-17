package com.org.digihub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigihubApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DigihubApplication.class);
		springApplication.run(args);
	}

}
