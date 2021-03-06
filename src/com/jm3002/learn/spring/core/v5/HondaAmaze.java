package com.jm3002.learn.spring.core.v5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	@Value("${hondaCity.color}")
	private String color;

	@Value("${hondaCity.mileage}")
	private double mileage;

	private MusicSystem musicSystem;

	@Autowired
	public HondaAmaze(@Qualifier("appleMusicSystem") MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName() + " with mileage of " + mileage);
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

}
