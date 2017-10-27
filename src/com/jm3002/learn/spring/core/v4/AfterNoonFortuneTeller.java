package com.jm3002.learn.spring.core.v4;

public class AfterNoonFortuneTeller implements FortuneService {

	public AfterNoonFortuneTeller(){
		System.out.println(this.getClass().getSimpleName()+" is being constructed.");
	}
	
	@Override
	public void tellTheFortune() {
		System.out.println("50-50 chances.");
	}
}
