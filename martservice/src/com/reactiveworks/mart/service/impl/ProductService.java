package com.reactiveworks.mart.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.mart.service.IProductService;

@WebService(targetNamespace = "http://service.mart.reactiveworks.com/", portName = "ProductServicePort", serviceName = "ProductServiceService")
public class ProductService implements IProductService {

	private List<String> bookList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();

	public ProductService() {
		bookList.add("Inferno");
		bookList.add("joyland");
		bookList.add("GOT");

		movieList.add("adfg");
		movieList.add("xcvd");
		movieList.add("dfgcv");

		musicList.add("dfg");
		musicList.add("xvvvvb");
		musicList.add("dfvgfsee");
	}

	@Override
	public List<String> getProductCategories() {
		List<String> productCategories = new ArrayList<String>();
		productCategories.add("books");
		productCategories.add("movies");
		productCategories.add("music");

		return productCategories;
	}

	@Override
	public List<String> getProductsByCategory(String category) {
		if (category.equals("books")) {
			return bookList;
		} else if (category.equals("movies")) {
			return movieList;
		} else if (category.equals("music")) {
			return musicList;
		} else {
			return null;
		}
	}

	@Override
	public boolean addProduct(String category, String product) {

		switch (category) {
		case "books":
			bookList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
	    default: 
	    	return false;

		}

		return true;
	}

}
