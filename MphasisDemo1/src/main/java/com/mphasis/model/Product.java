package com.mphasis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_CATALOGUE")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID", nullable=false, unique=true, length=10)
	private int id;
	
	@Column(name ="BRAND_NAME", nullable=false, unique=false, length=30)
	private String brandName;
	
	@Column(name ="PRODUCT_TYPE", nullable=false, unique=false, length=20)
	private String productType;
	
	@Column(name ="PRODUCT_PRICE", nullable=false, unique=false, length=10)
	private double productPrice;
	
	@Column(name ="PRODUCT_SIZE", nullable=false, unique=false, length=5)
	private int productSize;
	
	@Column(name ="PRODUCT_COLOR", nullable=false, unique=false, length=20)
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + id;
		result = prime * result + ((productColor == null) ? 0 : productColor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productSize;
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (id != other.id)
			return false;
		if (productColor == null) {
			if (other.productColor != null)
				return false;
		} else if (!productColor.equals(other.productColor))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productSize != other.productSize)
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", brandName=" + brandName + ", productType=" + productType + ", productPrice="
				+ productPrice + ", productSize=" + productSize + ", productColor=" + productColor + "]";
	}
	
	
}
