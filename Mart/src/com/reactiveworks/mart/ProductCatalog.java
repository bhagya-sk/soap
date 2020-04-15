package com.reactiveworks.mart;

import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.mart.service.ProductService;


@WebService(targetNamespace = "http://mart.reactiveworks.com/", portName = "ProductCatalogPort", serviceName = "ProductCatalogService")
public class ProductCatalog {
	
	private ProductService productService=new ProductService();

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
