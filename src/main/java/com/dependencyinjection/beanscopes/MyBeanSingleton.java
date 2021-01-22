package com.dependencyinjection.beanscopes;
/*
 * request and session are included
 * just like the scopes mentioned and navigated through
 * controller
 */
public class MyBeanSingleton {
	public MyBeanSingleton() {
		System.out.println("Prototype instance  created");
	}
}
