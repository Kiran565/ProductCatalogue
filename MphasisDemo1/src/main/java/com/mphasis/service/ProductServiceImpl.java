package com.mphasis.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.config.ProductDto;
import com.mphasis.mapping.ProductMapping;
import com.mphasis.model.Product;
import com.mphasis.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	private static String PRODUCT_SAVE_MESSAGE_SUCCESS = "Successfully Saved !!";
	private static String PRODUCT_SAVE_MESSAGE_FAILURE = "Successfully Not Saved !!";
	
	Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String saveProduct(ProductDto productDto) {
		try {
		logger.info(" Product Details for Saving {} " +productDto);
		
		Product product = productRepository.findByBrandNameAndProductTypeAndProductSize(productDto.getBrandName(), productDto.getProductType(), productDto.getProductSize());
		product = ProductMapping.convertProductDtoToProduct(productDto, product);	
		productRepository.save(product);
		return PRODUCT_SAVE_MESSAGE_SUCCESS;
		}
		catch(Exception e) {
			return PRODUCT_SAVE_MESSAGE_FAILURE;
		}
	}

	@Override
	public List<Product> findProductsByBrandName() {
		return productRepository.findProductsByBrandName();
	}
	
	@Override
	public List<Product> findProductsByProductColor() {
		return productRepository.findProductsByProductColor();
	}
	
	@Override
	public List<Product> findProductsByProductPrize() {
		return productRepository.findProductsByProductPrize();
	}
	
	@Override
	public List<Product> findProductsByProductSize() {
		return productRepository.findProductsByProductSize();
	}
	

	
	

}
