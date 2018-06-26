package com.github.cinnojam.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.cinnojam.portfolio")
@EntityScan(basePackages = "com.github.cinnojam.portfolio")
@EnableJpaRepositories(basePackages = "com.github.cinnojam.portfolio.repository")
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
}
