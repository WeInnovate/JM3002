package com.jm3002.learn.spring.core.v5;

import org.springframework.stereotype.Component;

@Component
public class AppleMusicSystem implements MusicSystem {

	public AppleMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
