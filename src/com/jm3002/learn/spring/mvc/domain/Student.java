package com.jm3002.learn.spring.mvc.domain;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.jm3002.learn.spring.mvc.ann.StudentCodePrefix;

public class Student {
	@Size(min = 3, message = " should have 3 characters")
	@NotNull /* (message="is required") */
	private String firstName;

	@NotNull(message = " last name is required")
	private String lastName;

	private String gender;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	private Date dob;
	
	@StudentCodePrefix(value="STD", message=" prefix error")
	private String stdCode;

	@Min(value = 18, message = " should be adult")
	@Max(value = 100, message = " should be human")
	private int age;

	@Pattern(regexp = "^[a-zA-Z0-9]{3}", message = " fksemfelkw")
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

}
