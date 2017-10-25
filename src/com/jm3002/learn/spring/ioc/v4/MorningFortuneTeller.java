package com.jm3002.learn.spring.ioc.v4;

public class MorningFortuneTeller implements FortuneService {

	public MorningFortuneTeller(){
		System.out.println("MorningFortuneTeller is being constructed.");
	}
	
	@Override
	public void tellTheFortune() {
		System.out.println("You will win.");
	}
}
