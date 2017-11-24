package com.jm3002.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "ROLL_NO")
	private long rollNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long rollNo, String name, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
	}
}
