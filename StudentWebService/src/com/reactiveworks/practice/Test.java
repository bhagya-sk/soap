package com.reactiveworks.practice;

import java.text.ParseException;

import com.reactiveworks.practice.webservice.StudentInfoWebService;

public class Test {

	public static void main(String[] args) throws ParseException {
	StudentInfoWebService i=new StudentInfoWebService();
	System.out.println(i.getStudents());

	}

}
