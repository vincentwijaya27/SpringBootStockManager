package com.example.StockManager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockManager.model.Product;
import com.example.StockManager.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long Id){
        return productService.getProductById(Id);
    }

    @GetMapping("/test-db")
    public String testDb() {
        return "Database connected!";
    }


    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

}
