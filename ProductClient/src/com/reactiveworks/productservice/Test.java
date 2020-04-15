package com.reactiveworks.productservice;

import com.reactiveworks.productservice.service.ParseException_Exception;
import com.reactiveworks.productservice.service.ProductWebService;
import com.reactiveworks.productservice.service.ProductWebServiceService;

public class Test {

	public static void main(String[] args) throws ParseException_Exception {
		
		ProductWebServiceService service=new ProductWebServiceService();
		ProductWebService port = service.getProductWebServicePort();
		port.getProducts();
	}

}
