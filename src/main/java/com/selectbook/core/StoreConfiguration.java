package com.selectbook.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.selectbook.core.dto.Document;

@Configuration
public class StoreConfiguration {

	@Bean
	public Document getDocument() {
		return new Document();
	}
}
