package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.stereotype.Service;


// Orderprocessing Service FraudCheckHander, stockCheckHandler ve paymentCheckHandler'ı birbirine bağlar ve sipariş işleme sürecini başlatır. Bu servisin ana göre alt sınıfların birbirleri koordineli olarak çalışmalarını sağlamaktır.

@Service
public class OrderBestApplicationService {

    private final FraudCheckHander fraudCheckHander;

    public OrderBestApplicationService(FraudCheckHander fraudCheckHander, StockCheckHandler stockCheckHandler, PaymentCheckHandler paymentCheckHandler) {
        this.fraudCheckHander = fraudCheckHander;
        fraudCheckHander.setNext(stockCheckHandler).setNext(paymentCheckHandler);
    }

    public void submit(OrderRequest orderRequest){
        // Sipariş işleme süreci başlatılır
        // Burada ise akış kontrollerini başlatıyoruz
       fraudCheckHander.handle(orderRequest);
    }


}
