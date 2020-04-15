package com.reactiveworks.productservice;

import java.text.ParseException;

import com.reactiveworks.productservice.dao.ProductDao;

public class Test {

	public static void main(String[] args)throws ParseException {
		ProductDao dao=new ProductDao();
		System.out.println(dao.getProducts());
		
	}

}
