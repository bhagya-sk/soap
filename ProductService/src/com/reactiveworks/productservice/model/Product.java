package com.reactiveworks.productservice.model;

import java.util.Date;

public class Product {
	private int productId;
	private String productName;
	private String productType;
	private Date manufacturedDt;

	public Product(int productId, String productName, String productType, Date manufacturedDt) {
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.manufacturedDt = manufacturedDt;
	}

	public Product() {

	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getManufecturedDt() {
		return manufacturedDt;
	}

	public void setManufecturedDt(Date manufecturedDt) {
		this.manufacturedDt = manufecturedDt;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", manufecturedDt=" + manufacturedDt + "]";
	}

}
