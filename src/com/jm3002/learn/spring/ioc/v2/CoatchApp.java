package com.jm3002.learn.spring.ioc.v2;

public class CoatchApp {

	public static void main(String[] args) {
		Coatch coatch = new FitnessCoatch();
		coatch.getDailyWorkout();
	}
}
