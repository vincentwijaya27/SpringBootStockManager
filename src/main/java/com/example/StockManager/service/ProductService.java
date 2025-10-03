package com.example.StockManager.service;

import org.springframework.stereotype.Service;

import com.example.StockManager.model.Product;
import com.example.StockManager.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    // constructor injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id){
        return productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product tidak ditemukan " + id));
    }

}
