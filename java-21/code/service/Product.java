/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mond
 */
class ProductService {

}

@RestController
public class Product {

    String[] products = {"Latte", "Mocha", "Cappuccino"};

    @GetMapping("/api/products")
    String[] getProducts() {
        return products;
    }
    
}

// Query Params <== Not avaliable for POST, PUT
// Header
// Body
