package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class InventoryService {

    private final ProductRepository repository;

    public InventoryService(ProductRepository repository) {
        this.repository = repository;
    }


    public  boolean checkStock(){

        Product p =  repository.findById(1L);
        System.out.println("Stok kontrol ediliyor...");
        return p.getStock() > 0;
    }

    public void reserveStock(Integer quantity){
        Product p =  repository.findById(1L);
        p.setStock(p.getStock() - quantity);
        System.out.println("Stoktan ayrildi...");
    }
}
