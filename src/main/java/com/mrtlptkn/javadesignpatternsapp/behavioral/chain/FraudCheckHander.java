package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.stereotype.Component;

// Concerete Handler
@Component
public class FraudCheckHander extends OrderHandler {


    // Burada bir sahtecilik kontrolü yapılmalı
    // FraudCheckHander da ne yapacağız kısmı ile handle methodu ilgileniyor.
    @Override
    public void handle(OrderRequest orderReq) {
        if(orderReq.isFraud()){
            Order entity = new Order();
            entity.setStatus("REJECTED");
            entity.setReason("Sahtecilik şüphesi tespit edildi!");
            System.out.println("Sipariş reddedildi: Sahtecilik şüphesi");
        } else {
            System.out.println("Sahtecilik kontrolü başarılı. Sonraki adıma geçiliyor.");
            passToNext(orderReq);
        }
    }
}
