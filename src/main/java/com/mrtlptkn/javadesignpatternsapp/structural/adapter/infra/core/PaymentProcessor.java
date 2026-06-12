package com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.core;

// Sistemimiz 3rd bir ödeme servisi ile çalışıyor
// Bu sebeple bu değişebilir, farklı ödeme servisleri kullanabiliriz diye
// uygulama içindeki kullanım yapısını bozmamak bir bir interface açıyoruz
// bu interface üzerinden 3rd servislere bağlanıcaz.

import java.math.BigDecimal;

public interface PaymentProcessor {
    void pay(BigDecimal amount, String currency);
}
