package com.mphasis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.model.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Integer>{

	Product findByBrandNameAndProductTypeAndProductSize(String brandName, String productType, int size);
	
	@Query("SELECT p from Product p ORDER BY p.brandName")
	List<Product> findProductsByBrandName();
	
	@Query("SELECT p from Product p ORDER BY p.productPrice")
	List<Product> findProductsByProductPrize();
	
	@Query("SELECT p from Product p ORDER BY p.productColor")
	List<Product> findProductsByProductColor();
	
	@Query("SELECT p from Product p ORDER BY p.productSize")
	List<Product> findProductsByProductSize();
	
}
