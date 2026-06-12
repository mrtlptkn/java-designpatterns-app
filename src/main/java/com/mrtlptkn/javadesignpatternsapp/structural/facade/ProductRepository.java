package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

    Product findById(Long id) {
        Product p = new Product();
        p.setStock(100);
        p.setName("Ürün " + id);
        return p;
    }
}
