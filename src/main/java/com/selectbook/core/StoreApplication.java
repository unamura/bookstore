package com.selectbook.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
public class StoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	
}