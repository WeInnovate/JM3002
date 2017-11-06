package com.jm3002.learn.spring.core.v5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	private MusicSystem musicSystem;

	@Autowired
	public HondaAmaze(@Qualifier("appleMusicSystem") MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + this.getClass().getSimpleName());
		musicSystem.playMusic();
	}

}
