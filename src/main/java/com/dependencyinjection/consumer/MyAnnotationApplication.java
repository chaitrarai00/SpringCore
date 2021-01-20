package com.dependencyinjection.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dependencyinjection.services.MessageService;

@Component
public class MyAnnotationApplication {
	
	//field based di
	@Autowired
	private MessageService messageService;
	
	//constructor based di
	@Autowired
	public MyAnnotationApplication(MessageService service) {
		this.messageService=service;
	}
	
	//setter based di
	@Autowired
	public void setService(MessageService service) {
		this.messageService=service;
	}
	
	public boolean processMessage(String msg, String reciever) {
		return this.messageService.sendMessage(msg, reciever);
	}
}
