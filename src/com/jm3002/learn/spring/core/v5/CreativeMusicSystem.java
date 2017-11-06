package com.jm3002.learn.spring.core.v5;

import org.springframework.stereotype.Component;

@Component
public class CreativeMusicSystem implements MusicSystem {

	public CreativeMusicSystem() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
