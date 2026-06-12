package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Data
public class Order {

    public Object setOrderedAt;
    private Long Id;
    private String code;
    private LocalDate shippedAt;
    private LocalDate orderedAt;
    private List<OrderLine> items;


}
