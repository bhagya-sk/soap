package com.reactiveworks.mart.service;

import java.util.List;

public interface IProductService {

	List<String> getProductCategories();

	List<String> getProductsByCategory(String category);

	boolean addProduct(String category, String product);

}