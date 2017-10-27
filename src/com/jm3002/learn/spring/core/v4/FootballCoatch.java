package com.jm3002.learn.spring.core.v4;

public class FootballCoatch implements Coatch {

	private FortuneService fortuneService;

	private String nationality;

	private double experience;

	private int age;

	public FootballCoatch() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	public void getDailyWorkout() {
		fortuneService.tellTheFortune();
		System.out.println("Run 5 KM");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballCoatch [nationality=" + nationality + ", experience=" + experience + ", age=" + age + "]";
	}
}
