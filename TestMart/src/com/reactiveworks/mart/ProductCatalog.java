package com.reactiveworks.mart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.reactiveworks.mart.service.ProductService;

@WebService(name = "name" ,portName = "portname",serviceName = "servicename")
public class ProductCatalog {
	
	private ProductService productService=new ProductService();

	@WebMethod
	@WebResult(name = "name_m",partName = "partname")
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	public List<String> getProductByCategory(String category){
		return productService.getProductsByCategory(category);
	}
	
	public boolean addProduct(String category,String product) {
		return productService.addProduct(category,product);
	}
	
}
