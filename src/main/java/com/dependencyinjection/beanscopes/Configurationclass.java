package com.dependencyinjection.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.dependencyinjection.beanscopes")
public class Configurationclass {
	
	@Bean
	@Scope(value="singleton")
	public MyBeanSingleton beanSingleton() {
		return new MyBeanSingleton();
	}
	
	@Bean
	@Scope(value="prototype")
	public MyBeanPrototype beanPrototype() {
		return new MyBeanPrototype();
	}
}
