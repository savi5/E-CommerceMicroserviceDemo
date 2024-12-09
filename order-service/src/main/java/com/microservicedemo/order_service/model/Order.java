package com.microservicedemo.order_service.model;

public record Order(Long id, Long productId, String name, int price) {

	public Object getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
