package com.mphasis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mphasis.service.ProductService;
import com.mphasis.service.ProductServiceImpl;

@Configuration
public class ProductBeanConfig {
	
	@Bean
	ProductService productService(){
		return new ProductServiceImpl();
	}

}
