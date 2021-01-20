package com.dependencyinjection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjection.services.EmailMessageService;
import com.dependencyinjection.services.MessageService;

@Configuration
@ComponentScan(value="com.dependencyinjection.consumer")
public class DIConfiguartion {
	
	@Bean
	public MessageService getMessageService() {
		return new EmailMessageService();
	}

}
