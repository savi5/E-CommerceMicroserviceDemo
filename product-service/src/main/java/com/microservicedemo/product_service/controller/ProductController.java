package com.microservicedemo.product_service.controller;

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

import com.microservicedemo.product_service.model.Product;
import com.microservicedemo.product_service.repository.ProductRepository;


@RestController
@RequestMapping("/product")
public class ProductController{

    private static final Logger LOGGER
            = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepository repository;


    @PostMapping
    public Product add(@RequestBody Product Product) {
        LOGGER.info("Product add: {}", Product);
        return repository.addProduct(Product);
    }

    @GetMapping
    public List<Product> findAll() {
        LOGGER.info("Product find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        LOGGER.info("Product find: id={}", id);
        return repository.findById(id);
    }


	
}