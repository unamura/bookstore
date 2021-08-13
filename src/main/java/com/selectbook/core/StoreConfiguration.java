package com.selectbook.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.selectbook.core.dto.DocumentEntity;

@Configuration
public class StoreConfiguration {

	@Bean
	public DocumentEntity getDocument() {
		return new DocumentEntity();
	}
}
