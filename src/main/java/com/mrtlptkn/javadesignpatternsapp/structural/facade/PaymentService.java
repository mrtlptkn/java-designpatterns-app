package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay() {
        System.out.println("Odeme islemi gerceklestiriliyor...");
    }
}
