package com.mrtlptkn.javadesignpatternsapp.structural.adapter.application;

import com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.core.BankPaymentServiceAdapter;
import org.springframework.stereotype.Component;

@Component
public class BankPaymentApplication {

    // Bu olursa kodu refator etmemiz gerekir. Bunu yapmayalım
    //private  ABankPaymentService aBankPaymentService = new ABankPaymentService();

    // doğrusu tüm servisler haberleşirken adapter üzerinden haberleşecek.
    private final BankPaymentServiceAdapter adapter;

    public BankPaymentApplication(BankPaymentServiceAdapter adapter) {
        this.adapter = adapter;
    }

    public void handle(PaymentRequest request){
        System.out.println("BankPaymentApplication: Odeme talebi alindi: " + request.amount() + " " + request.currency());
        this.adapter.pay(request.amount(), request.currency());
        System.out.println("BankPaymentApplication: Odeme islemi tamamlandi.");
    }

}
