package com.jm3002.learn.spring.core.v5.ann;

public class Lion extends Animal {
	
	@Override
	public void work() {
		System.out.println(this.getClass().getSimpleName() + " is hunting.");
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sleep();
	}
}
