package com.reactiveworks.practice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://practice.reactiveworks.com/", portName = "AdderPort", serviceName = "AdderService")
public class Adder {

	public int add(int a,int b) {
		return a+b;
	}
	
}
