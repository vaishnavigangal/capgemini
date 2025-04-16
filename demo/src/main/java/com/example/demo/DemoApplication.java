package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.controller.*;
@SpringBootApplication
@EntityScan(basePackages = "com.entity")
@ComponentScan(basePackages = {"com.controller", "com.config","com.service", "com.repository", "com.entity","com.dto"})
@EnableJpaRepositories(basePackages = "com.repository")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
