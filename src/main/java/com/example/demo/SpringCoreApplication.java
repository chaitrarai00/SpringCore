package com.example.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjection.configuration.DIConfiguartion;
import com.dependencyinjection.consumer.MyAnnotationApplication;

//@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		AnnotationConfigApplicationContext annotationConfigApplicationContext
		=new AnnotationConfigApplicationContext(DIConfiguartion.class);
		MyAnnotationApplication myAnnotationApplication=
				annotationConfigApplicationContext.getBean(MyAnnotationApplication.class);
		myAnnotationApplication.processMessage
		("You got to code and not listen to anyone", "Youfromthefuture@wellwish.com");
		annotationConfigApplicationContext.close();
	}

}
