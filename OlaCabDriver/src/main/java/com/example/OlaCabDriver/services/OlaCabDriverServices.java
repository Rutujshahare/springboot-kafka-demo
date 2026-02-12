package com.example.OlaCabDriver.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.OlaCabDriver.Constant.AppConstant;

@Service
public class OlaCabDriverServices {
	@Autowired
private KafkaTemplate<String, String> kafkaTemplate;
	private Logger logger=LoggerFactory.getLogger(OlaCabDriverServices.class);
	public Boolean UpdateCabLocation(String location) {
		this.kafkaTemplate.send(AppConstant.TOPIC_NAME_,location);
		logger.info("the location is updated by cab driver :");
		return true;
	}
}
