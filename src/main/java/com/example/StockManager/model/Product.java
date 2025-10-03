package com.example.StockManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @SequenceGenerator(name = "product_seq", sequenceName = "product_sequence", allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @Column(name = "product_id")
    private Long id;

    @Column(nullable = false, precision = 10, scale = 2)
    private double quantity;

    @Column(nullable = false)
    private String name;

    @Column(name = "sku_code", nullable = false)
    private String skuCode;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "product_category_id", nullable = false)
    private ProductCategory category;


}
