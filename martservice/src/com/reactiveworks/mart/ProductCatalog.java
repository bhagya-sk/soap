package com.reactiveworks.mart;

import java.util.List;

import com.reactiveworks.mart.service.IProductService;
import com.reactiveworks.mart.service.impl.ProductService;


public class ProductCatalog {
	
	private IProductService productService=new ProductService();

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
