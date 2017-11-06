package com.jm3002.learn.spring.core.v5.ann;

public class Animal {
	
	public void eat(){
		System.out.println(this.getClass().getSimpleName()+" is eating.");
	}
	
	public void work(){
		System.out.println(this.getClass().getSimpleName()+" is working.");
	}
	
	@Deprecated
	public void sleep(){
		System.out.println(this.getClass().getSimpleName()+" is sleeping.");
	}
	
	public void rest(){
		System.out.println(this.getClass().getSimpleName()+" is rest.");
	}
}
