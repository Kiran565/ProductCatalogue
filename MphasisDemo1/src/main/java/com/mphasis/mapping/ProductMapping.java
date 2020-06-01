package com.mphasis.mapping;

import com.mphasis.config.ProductDto;
import com.mphasis.model.Product;

public class ProductMapping {

	public static Product convertProductDtoToProduct(ProductDto productDto, Product product) {
		if (product == null) {
			product = new Product();
		}
		product.setBrandName(productDto.getBrandName());
		product.setProductType(productDto.getProductType());
		product.setProductPrice(productDto.getProductPrice());
		product.setProductSize(productDto.getProductSize());
		product.setProductColor(productDto.getProductColor());
		return product;
	}

}
