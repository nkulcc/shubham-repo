package com.springlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class SpringloggingApplication {
	
	private static Logger logger=LoggerFactory.getLogger(SpringloggingApplication.class);
	
	public static void main(String[] args) {
		logger.info("I am info");
		logger.debug("I am debug");
		
		logger.error("I am error");
		logger.warn("I am warn");
		logger.trace("I am trace");
		
		SpringApplication.run(SpringloggingApplication.class, args);
		
	}

}
