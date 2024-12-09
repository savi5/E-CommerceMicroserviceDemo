package com.microservicedemo.order_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.microservicedemo.order_service.model.Order;



@Repository

public class OrderRepository {
	
public List<Order> orders = new ArrayList<>();
	
	public Order addOrder(Order Order) {
		orders.add(Order);
		return Order;
	}
	
	public Order findById(Long id) {
		return orders.stream()
				.filter(a -> a.getId().equals(id))
				.findFirst()
				.orElseThrow();
		
	}
	
	public List<Order> findAll() {
		return orders;
		
		}
	
    
	public List<Order> findByDepartment(Long productId) {
	        return orders.stream()
	                .filter(a -> a.productId().equals(productId))
	                .toList();
	    }
}
