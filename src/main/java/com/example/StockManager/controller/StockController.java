package com.example.StockManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    
    @GetMapping("/")
    public String index(){
        return "hello there";
    }

}
