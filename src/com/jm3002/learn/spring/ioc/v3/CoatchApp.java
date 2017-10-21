package com.jm3002.learn.spring.ioc.v3;

public class CoatchApp {

	public static void main(String[] args) {
		Coatch coatch = CoatchFactory.getCoatch();
		coatch.getDailyWorkout();
	}
}
