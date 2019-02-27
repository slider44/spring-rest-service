package com.mainangular.ws.api.angularspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mainangular"})
public class AngularSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringApplication.class, args);
	}

}
