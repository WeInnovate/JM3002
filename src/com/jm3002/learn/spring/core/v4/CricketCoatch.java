package com.jm3002.learn.spring.core.v4;

public class CricketCoatch implements Coatch {

	private FortuneService fortuneService;
	
	public CricketCoatch(FortuneService newFortuneService){
		this.fortuneService = newFortuneService;
		System.out.println("CricketCoatch is being constructed.");
	}
	
	public void getDailyWorkout(){
		fortuneService.tellTheFortune();
		System.out.println("Run 2 KM");
	}
	
	public void battingTips(){
		System.out.println("Focus on ball");
	}
}
