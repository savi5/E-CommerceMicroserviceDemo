package com.microservicedemo.product_service.model;

import java.util.ArrayList;
import java.util.List;

public class Product{
	private Long id;
	private String name;
	private List<Order> orders = new ArrayList<>();
	
	public Product(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}