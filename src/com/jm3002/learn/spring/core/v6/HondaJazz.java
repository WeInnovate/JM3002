package com.jm3002.learn.spring.core.v6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaJazz implements Car {
	
	@Autowired
	@Qualifier("creativeMusicSystem")
	private MusicSystem musicSystem;

	public HondaJazz() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + this.getClass().getSimpleName());
		musicSystem.playMusic();
	}
}
