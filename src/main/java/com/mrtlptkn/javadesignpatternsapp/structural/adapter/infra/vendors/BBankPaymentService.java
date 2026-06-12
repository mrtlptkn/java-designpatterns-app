package com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.vendors;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BBankPaymentService {

    public void makePayment(BigDecimal amount, String currency) {
        // BBank'ın ödeme işlemi gerçekleştirme mantığı
        System.out.println("BBank ile " + amount + " " + currency + " ödendi.");
    }
}
