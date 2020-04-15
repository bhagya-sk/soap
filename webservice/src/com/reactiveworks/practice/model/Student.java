package com.reactiveworks.practice.model;

import java.util.Date;

public class Student {

	private String name;
	private int rollNo;
	private Date dob;
	private double percentage;
	
	public Student() {
		
	}

	public Student(String name,int rollNo,Date dob,double percentage) {
		this.name=name;
		this.rollNo=rollNo;
		this.dob=dob;
		this.percentage=percentage;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", dob=" + dob + ", percentage=" + percentage + "]";
	}

}
