package com.kafka.anteraja;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	@KafkaListener(topics = "anteraja", groupId = "groupId")
	void Listener(String data) {
		System.out.println("Listener hai "+data);
	}

}
