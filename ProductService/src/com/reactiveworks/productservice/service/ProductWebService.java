package com.reactiveworks.productservice.service;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.productservice.dao.ProductDao;
import com.reactiveworks.productservice.model.Product;

@WebService(targetNamespace = "http://service.productservice.reactiveworks.com/", portName = "ProductWebServicePort", serviceName = "ProductWebServiceService")
public class ProductWebService {

	ProductDao dao = new ProductDao();

	public List<Product> getProducts() throws ParseException  {

		return dao.getProducts();
	}

	

}
