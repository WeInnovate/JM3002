package com.jm3002.learn.spring.core.v5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-ann-config.xml");
		Car car = context.getBean("hondaJazz", Car.class);
		
		car.driveTheCar();
	}
}
