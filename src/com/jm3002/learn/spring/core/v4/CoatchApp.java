package com.jm3002.learn.spring.core.v4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoatchApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		Coatch coatch = (Coatch) context.getBean("coatch");
		System.out.println(coatch.hashCode());
//		Coatch coatchNew = context.getBean("coatch", Coatch.class);
//		System.out.println(coatchNew.hashCode());
		System.out.println(coatch);
		coatch.getDailyWorkout();
	}
}
