package com.mphasis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mphasis.model.Product;
import com.mphasis.config.ProductDto;

@Service
public interface ProductService {

	String saveProduct(ProductDto productDto);
	
	List<Product> findProductsByBrandName();

	List<Product> findProductsByProductColor();

	List<Product> findProductsByProductPrize();

	List<Product> findProductsByProductSize();
}
