package com.jm3002.learn.spring.core.v6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car car1 = context.getBean("hondaAmaze", Car.class);
		Car car2 = context.getBean("hondaAmaze", Car.class);
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		
		car1.driveTheCar();
		
		context.close();
	}
}
