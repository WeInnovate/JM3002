package com.jm3002.learn.spring.mvc.domain;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	 private String country;
	 
	 private String[] courses;
	 
	 private boolean grad;
	 
	 private String comment;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public boolean isGrad() {
		return grad;
	}

	public void setGrad(boolean grad) {
		this.grad = grad;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
