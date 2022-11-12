package com.focusonpoint.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Begin.....");
	}
	public static void main(String[] args) {
		logger.info("Application execution Started...");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
		logger.info("Application execution Ended...");
	}

}
