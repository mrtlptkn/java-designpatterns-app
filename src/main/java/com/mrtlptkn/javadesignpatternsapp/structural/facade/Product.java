package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String name;
    private BigDecimal price;
    private Integer stock;
}
