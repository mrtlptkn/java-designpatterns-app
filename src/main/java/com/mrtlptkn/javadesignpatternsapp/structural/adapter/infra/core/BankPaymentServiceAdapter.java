package com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.core;

import com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.vendors.ABankPaymentService;
import com.mrtlptkn.javadesignpatternsapp.structural.adapter.infra.vendors.BBankPaymentService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// Tüm kendi uygulama referansımızda ise ThirdPartyPaymentServiceAdapter adapterı kullanıyoruz.
// Böylece herhangi bir değişikilikte uygulamada kırılmalar olmuyor.

// Adapter Pattern Dependecy Iversion prensibine uygum sağlayamaz sebebi ise ThirdPartyPaymentService bizim değil herhangi bir interface ile implemente edemeyiz.

// Anti Corruption -> Bozulma Önleyici bir katman sağlamak.
// Uygulamalar arası yazılmış bir package da olabilir. com.domainName.payment.core package;
// Not: vendors tanımları com.domainName.payment.core package içinde yazılacak, uygulamadan bağımsız güncellenecek ki, birden fazla aynı altyapıya tüketen uygulama bu packagedan yararlansın.
@Component
public class BankPaymentServiceAdapter implements PaymentProcessor {

    // Wrapleyeceğimiz servis ne ?
    private  final ABankPaymentService thirdPartyPaymentService;

    public BankPaymentServiceAdapter(ABankPaymentService thirdPartyPaymentService) {
        this.thirdPartyPaymentService = thirdPartyPaymentService;
    }

    @Override
    public void pay(BigDecimal amount, String currency) {
        // Üçüncü taraf ödeme servisine uygun şekilde ödeme işlemi gerçekleştirilir.
        System.out.println("ThirdPartyPaymentService ile ödeme yapıldı: " + amount + " " + currency);
        this.thirdPartyPaymentService.makePayment(amount, currency);
    }
}
