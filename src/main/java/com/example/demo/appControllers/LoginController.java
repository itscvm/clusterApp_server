package com.example.demo.appControllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.appConstants.URL_Constants;



@RestController
public class LoginController {
	
	private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	@PostMapping(URL_Constants.login_Url)
	public ResponseEntity<Object> login(){
		logger.info("Inside Login Method :  ");
		HttpHeaders header=new HttpHeaders();
		header.add("Content-Type", "application/json; charset=UTF-8");
		
		
		return new ResponseEntity<>(null,header,HttpStatus.OK);
	}
	

}
