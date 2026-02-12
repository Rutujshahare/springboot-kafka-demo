package com.example.OlaCabDriver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.OlaCabDriver.services.OlaCabDriverServices;

@RestController("/kafka")
public class OlaCabDriverController {

	@Autowired
	private OlaCabDriverServices olaCabDriverServices;
	public ResponseEntity<?> updateLocation(){
		this.olaCabDriverServices.UpdateCabLocation("("+Math.round(Math.random())*100+","+Math.round(Math.random())*100+")");
		return new ResponseEntity<>(Map.of("message","Location is printed by cab"),HttpStatus.OK);
	}
	
}
