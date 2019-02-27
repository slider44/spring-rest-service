package com.mainangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.mainangular.service.CustomerService;
import com.mainangular.service.CustomerServiceImpl;
import com.mainangular.tools.GracefulShutdown;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

//@SpringBootApplication(scanBasePackages = { "com.mainangular" })
//@EnableJpaAuditing
@SpringBootApplication
public class AngularSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringApplication.class, args);
	}
	
//	@Bean
//	public GracefulShutdown gracefulShutdown() {
//		return new GracefulShutdown();
//	}
//
//	@Bean
//	public ConfigurableServletWebServerFactory webServerFactory(final GracefulShutdown gracefulShutdown) {
//		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//		factory.addConnectorCustomizers(gracefulShutdown);
//		return factory;
//	}

}
