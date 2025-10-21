package com.example.StockManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_Category")
public class ProductCategory {

    @Id
    @SequenceGenerator(name = "prodCat_seq", sequenceName = "prodCat_sequence", allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodCat_seq")
    @Column(name = "product_category_id")
    private Long id;

    @Column(nullable = false)
    private String name;
}
