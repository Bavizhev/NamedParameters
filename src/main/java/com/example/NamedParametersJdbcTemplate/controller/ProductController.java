package com.example.NamedParametersJdbcTemplate.controller;

import com.example.NamedParametersJdbcTemplate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Обработка GET-запроса на endpoint /products/fetch-product
    @GetMapping("/products/fetch-product")
    public String fetchProduct(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}