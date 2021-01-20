package com.dependencyinjection.consumer;

import com.dependencyinjection.services.MessageService;

public class MyXmlApplication {
	private MessageService messageService;
	
	//constructor-based di
//	public MyXmlApplication(MessageService service) {
//		this.messageService=service;
//	}
	
	public void setService(MessageService service) {
		this.messageService=service;
	}
	
	public boolean processMessage(String msg, String reciever) {
		return this.messageService.sendMessage(msg, reciever);
	}
	
}
