package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLine {
    private Long OrderId;
    private Long productId;
    private Integer quantity;
    private BigDecimal lineTotal;
}
