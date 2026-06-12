package com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.vendors;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// Senorya gereği bu bir application içindeki service
// Supplier Servisi temsil ediyor.

// Amaç ThirdPartyPaymentService Direkt kullanmadan kendi PaymentProcessor interface üzerinden bu işlemi yürütmek. ThirdPartyPaymentService bunun uyuglamanın bir çok yerine referansının dağılmasını istemiyoruz.
// AWS Storage, Azure Storage , Google Cloud Storage, Firabase FireStore, Supabase Store

@Component
public class ABankPaymentService {

    public PaymentStatus makePayment(BigDecimal total, String current){
        System.out.println("ThirdPartyPaymentService: " + total + " " + current + " odeme islemi gerceklestiriliyor...");
        return PaymentStatus.OK;
    }

}
