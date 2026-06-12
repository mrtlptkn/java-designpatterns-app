package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Coffee implements Beverage {

    private BigDecimal cost;
    private String description = "Sade Kahve";

}
