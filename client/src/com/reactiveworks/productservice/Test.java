package com.reactiveworks.productservice;

import com.reactiveworks.productservice.service.DataBaseAccessFailureException_Exception;
import com.reactiveworks.productservice.service.ProductWebService;
import com.reactiveworks.productservice.service.ProductWebServiceService;
import com.reactiveworks.productservice.service.UnableToReadPropertyFileException_Exception;

public class Test {

	public static void main(String[] args) throws UnableToReadPropertyFileException_Exception, DataBaseAccessFailureException_Exception {
		ProductWebServiceService service=new ProductWebServiceService();
		ProductWebService port = service.getProductWebServicePort();
		System.out.println(port.getProducts());

	}

}
