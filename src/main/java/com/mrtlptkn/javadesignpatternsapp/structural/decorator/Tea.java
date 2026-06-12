package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Tea implements Beverage {
    private String description = "Çay";
    private BigDecimal cost = new BigDecimal("10.0");
}
