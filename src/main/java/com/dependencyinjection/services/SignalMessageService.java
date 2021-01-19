package com.dependencyinjection.services;

public class SignalMessageService implements MessageService{

	@Override
	public boolean sendMessage(String msg, String reciever) {
		System.out.println("Signal sent from "+reciever);
		return true;
	}

}
