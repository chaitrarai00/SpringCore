package com.dependencyinjection.services;

public class EmailMessageService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String reciever) {
		System.out.println("Email sent from "+reciever);
		return true;
	}

}
