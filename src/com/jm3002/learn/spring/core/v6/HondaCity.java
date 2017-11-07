package com.jm3002.learn.spring.core.v6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {
	
	private MusicSystem musicSystem;

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + this.getClass().getSimpleName());
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	@Autowired
	@Qualifier("appleMusicSystem")
	public void selkfnlkwfnlwk(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}

}
