package com.example.BookPerson.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.BookPerson.constant.BookPersonConstant;

@Configuration
public class BookPersonConfig {
@KafkaListener(topics =BookPersonConstant.TOPIC_NAME,groupId = BookPersonConstant.GROUP_NAME)
public void updateLocation(String value) {
	System.out.println(value);
}
}
