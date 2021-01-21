package com.dependencyinjection.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
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
