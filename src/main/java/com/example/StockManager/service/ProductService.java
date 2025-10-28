package com.example.StockManager.service;

import java.math.BigDecimal;
import java.util.List;

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

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    
public Product save(Product product) {
    if (product.getQuantity() == null) {
        product.setQuantity(BigDecimal.ZERO);
    }

    if (product.getName() != null) {
        product.setName(product.getName().trim().toUpperCase());
    }

    return productRepository.save(product);
}


}
