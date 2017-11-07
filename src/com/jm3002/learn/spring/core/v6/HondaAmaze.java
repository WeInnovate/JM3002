package com.jm3002.learn.spring.core.v6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HondaAmaze implements Car {

	@Value("${hondaCity.color}")
	private String color;

	// @Value("${hondaCity.mileage}")
	@Value("10.7")
	private double mileage;
	
	private int speed;

	private MusicSystem musicSystem;

	@Autowired
	public HondaAmaze(@Qualifier("appleMusicSystem") MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName() + " with mileage of " + mileage+" and at "+speed+" KMPH speed.");
		musicSystem.playMusic();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	@PostConstruct
	public void doSomethigAfterBeanInitialization(){
		System.out.println("I'm running after bean initialization.");
		this.speed = 120;
	}
	
	@PreDestroy
	public void doSomethigBeforeBeanDestruction(){
		System.out.println("I'm running before bean destruction.");
	}
	

}
