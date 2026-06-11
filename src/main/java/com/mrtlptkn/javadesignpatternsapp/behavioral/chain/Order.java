package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import lombok.Data;

@Data
public class Order {
    private String orderCode;
    private String status;
    private String reason;
}
