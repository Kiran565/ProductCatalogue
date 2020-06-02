package com.mphasis.config;

public class ProductDto {

	private int id;
	
	private String brandName;
	
	private String productType;
	
	private double productPrice;
	
	private int productSize;
	
	private String productColor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductSize() {
		return productSize;
	}

	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", brandName=" + brandName + ", productType=" + productType + ", productPrice="
				+ productPrice + ", productSize=" + productSize + ", productColor=" + productColor + "]";
	}
	
	
	
}
