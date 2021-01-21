package com.example.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependencyinjection.beanscopes.MyBeanPrototype;
import com.dependencyinjection.beanscopes.MyBeanSingleton;
import com.dependencyinjection.configuration.DIConfiguartion;
import com.dependencyinjection.consumer.MyAnnotationApplication;
import com.dependencyinjection.consumer.MyXmlApplication;

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
		MyBeanSingleton beanSingleton1=annotationConfigApplicationContext.getBean(MyBeanSingleton.class);
		MyBeanSingleton beanSingleton2=annotationConfigApplicationContext.getBean(MyBeanSingleton.class);
		System.out.println("Are singleton objects equal? "+beanSingleton1.equals(beanSingleton2)+" see for youself Bean1:"+beanSingleton1.hashCode()+"Bean2: "+beanSingleton2.hashCode());
		MyBeanPrototype beanPrototype1 =annotationConfigApplicationContext.getBean(MyBeanPrototype.class);
		MyBeanPrototype beanPrototype2=annotationConfigApplicationContext.getBean(MyBeanPrototype.class);
		System.out.println("Are singleton objects equal? "+beanPrototype1.equals(beanPrototype2)+" see for youself Bean1:"+beanPrototype1.hashCode()+"Bean2: "+beanPrototype2.hashCode());
		annotationConfigApplicationContext.close();
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXmlApplication app=context.getBean(MyXmlApplication.class);
		app.processMessage("You got to code and not listen to anyone", "Youfromthefuture@wellwish.com");
		
	}

}
