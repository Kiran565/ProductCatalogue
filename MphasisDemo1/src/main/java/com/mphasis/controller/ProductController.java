package com.mphasis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.config.ProductDto;
import com.mphasis.model.Product;
import com.mphasis.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PutMapping("/product/save")
	public String saveProduct(@RequestBody ProductDto productDto){
		return productService.saveProduct(productDto);
	}
	
	
	@GetMapping("/products/byBrand")
	public List<Product> findProductsByBrandName(){
		return productService.findProductsByBrandName();
	}
	
	@GetMapping("/products/byColor")
	public List<Product> findProductsByProductColor() {
		return productService.findProductsByProductColor();
	}
	
	@GetMapping("/products/byPrice")
	public List<Product> findProductsByProductPrize() {
		return productService.findProductsByProductPrize();
	}
	
	@GetMapping("/products/bySize")
	public List<Product> findProductsByProductSize() {
		return productService.findProductsByProductSize();
	}
	

}
