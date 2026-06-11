package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.stereotype.Component;

@Component
public class OrderBadApplicationService {
    // FraudService Dependency
    // InventoryService Dependency
    // PaymentService Dependency
    // Log Dependency
    // Order Repository for save order status
    // sıralı işlem olduğunu anlamak için process methodu içerisindeki if else yapısına bakmak gerekecekti.

    public  void  process(OrderRequest request) {

        if(request.isFraud()){ // Fraud Service Check
            throw  new UnsupportedOperationException("Fraud order can not be processed");
        } else {
            if (request.isStockAvailable()) { // Inventory Service Check
                if (request.isPaymentVerified()) { // Payment Service Check
                    System.out.println("Order processed successfully");
                } else {
                    System.out.println("Payment failed. Order cannot be processed.");
                }
            } else {
                System.out.println("Stock not available. Order cannot be processed.");
            }
        }
    }

}
