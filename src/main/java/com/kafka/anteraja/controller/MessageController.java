package com.kafka.anteraja.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.anteraja.model.MessageRequest;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
	
	private KafkaTemplate<String, String> kafkaTemplate;

	public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@PostMapping
	public void publish(@RequestBody MessageRequest request) {
		this.kafkaTemplate.send("anteraja", request.getMessage());
	}

}
