package com.dependencyinjection.services;

public class TwitterMessageService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String reciever) {
		System.out.println("Tweet sent from "+reciever);
		return true;
	}

}
