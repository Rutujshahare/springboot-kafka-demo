package com.example.OlaCabDriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.example.OlaCabDriver.Constant.AppConstant;

@Configuration
public class OlaCabConfig {

	public NewTopic topic() {
		return TopicBuilder.name(AppConstant.TOPIC_NAME_).build();
	}
}
