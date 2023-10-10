package com.consumer.consume;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = {"student-enrollments", "student-grades", "student-achievements"}, groupId = "group-1")
	public void consume(String value) {
		System.out.println("consumed: "+value.toString());
	}
	
}
