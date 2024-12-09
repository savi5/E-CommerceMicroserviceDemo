package com.microservicedemo.product_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.microservicedemo.product_service.model.Product;

@Repository

public class ProductRepository{
	
	public List<Product> products = new ArrayList<>();
	
	public Product addProduct(Product product) {
		products.add(product);
		return product;
	}
	
	public Product findById(Long id) {
		return products.stream()
				.filter(product -> product.getId().equals(id))
				.findFirst()
				.orElseThrow();
		
	}
	
	public List<Product> findAll() {
		return products;
		
		}
}