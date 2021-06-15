package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.sample.app.configuration"),@ComponentScan("com.sample.app.controller")})
@EnableJpaRepositories("com.sample.app.repo")
@EntityScan("com.sample.app.entity")
public class SecurityWithInMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityWithInMemoryApplication.class, args);
	}

}
