package com.microservicedemo.order_service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicedemo.order_service.model.Order;
import com.microservicedemo.order_service.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	private static final Logger LOGGER
    = LoggerFactory.getLogger(OrderController.class);

@Autowired
OrderRepository repository;

@PostMapping
public Order add(@RequestBody Order Order) {
	LOGGER.info("Order add: {}", Order);
	return repository.addOrder(Order);
}

@GetMapping
public List<Order> findAll() {
	LOGGER.info("Order find");
	return repository.findAll();
}

@GetMapping("/{id}")
public Order findById(@PathVariable("id") Long id) {
	LOGGER.info("Order find: id={}", id);
	return repository.findById(id);
}



}
