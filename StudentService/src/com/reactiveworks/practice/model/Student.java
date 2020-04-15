package com.reactiveworks.practice.model;

public class Student {
	
	private String name;
	private int rollNo;
	private double percentage;
	
	public Student(String name,int rollNo,double percentage) {
	  this.name=name;
	  this.rollNo=rollNo;
	  this.percentage=percentage;
	}
	
	public Student() {
		
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", percentage=" + percentage + "]";
	}
	
	

}
