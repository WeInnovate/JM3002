package com.jm3002.learn.spring.core.v4;

public class MorningFortuneTeller implements FortuneService {

	public MorningFortuneTeller(){
		System.out.println(this.getClass().getSimpleName()+" is being constructed.");
	}
	
	@Override
	public void tellTheFortune() {
		System.out.println("You will win.");
	}
}
