package com.jm3002.learn.spring.ioc.v4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoatchApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		Coatch coatch = (Coatch) context.getBean("coatch");
		System.out.println(coatch.hashCode());
		Coatch coatchNew = (Coatch) context.getBean("coatch");
		System.out.println(coatchNew.hashCode());
		coatch.getDailyWorkout();
	}
}
