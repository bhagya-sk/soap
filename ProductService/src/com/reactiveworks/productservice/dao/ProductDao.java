package com.reactiveworks.productservice.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.productservice.model.Product;

public class ProductDao {

	List<Product> products=new ArrayList<Product>();

	public List<Product> getProducts() throws ParseException  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		date = sdf.parse("1999-07-26");
		products.add(new Product(6,"Sony","Mobile",date)) ;  
		
		
		return products;
	}
	

}
