package com.kafka.anteraja.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
	
	@Bean
	public NewTopic anterajaTopic() {
		System.out.println("test");
		return TopicBuilder.name("anteraja").build();
	}
}
