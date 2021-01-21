package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjection.consumer.MyAnnotationApplication;
import com.dependencyinjection.services.MessageService;


@Configuration
@ComponentScan(value="com.dependencyinjection.consumer")
public class MyAnnotationApplicationTest {
	
	private AnnotationConfigApplicationContext context=null;
	
	public MessageService getMessageService() {
		return new MessageService() {
						public boolean sendMessage(String msg, String reciever) {
							System.out.println("Mock Servicee");
							return true;
			}
		};
	}
	
	@Before
	public void setUp() throws Exception{
		context=new AnnotationConfigApplicationContext(MyAnnotationApplicationTest.class);
	}
	@After
	public void tearDown() throws Exception{
		context.close();
	}
	
	public void test() {
		MyAnnotationApplication app=context.getBean(MyAnnotationApplication.class);
		Assert.assertTrue(app.processMessage("Please code and learn", "youfromthefuture@why.com"));
	}
}
