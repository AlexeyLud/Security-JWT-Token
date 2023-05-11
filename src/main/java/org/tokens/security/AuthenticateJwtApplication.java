package org.tokens.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"org.tokens.security.controller", "org.tokens.security.serviceImpl",
		"org.tokens.security.config.jwt", "org.tokens.security.config"})
@EntityScan(basePackages = "org.tokens.security.models")
@EnableJpaRepositories(basePackages = "org.tokens.security.repository")

public class AuthenticateJwtApplication {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticateJwtApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AuthenticateJwtApplication.class, args);
		logger.info("Server started");
	}

}
