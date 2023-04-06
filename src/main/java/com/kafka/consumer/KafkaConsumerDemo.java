package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerDemo {
	
	@KafkaListener(topics = "MyTopic", groupId = "mygroupid")
	public void consume(String message) {
		
		System.out.println("message : "+ message);
	}

}
