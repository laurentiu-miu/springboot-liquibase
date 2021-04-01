package com.example.springbootliquibase;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootLiquibaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLiquibaseApplication.class, args);
	}

}
