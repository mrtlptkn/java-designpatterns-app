package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.stereotype.Component;

@Component
public class PaymentCheckHandler extends OrderHandler {
    @Override
    public void handle(OrderRequest orderRequest) {

        if(orderRequest.isPaymentVerified()){
            Order entity = new Order();
            entity.setStatus("Approved");
            entity.setReason("Ödeme doğrulandı, sipariş onaylandı!");
            System.out.println("Sipariş onaylandı: Ödeme doğrulandı");

            // yeni bir işlem eklenirse zincire eklenebilir, bu yüzden passToNext çağırıyoruz.
            // Son adımda gerek yok ama bu son adımlıktan çıkarsa passToNext eklenmeli. Yoksa şuan hatalı çalışıyor

        } else {
            Order entity = new Order();
            entity.setStatus("REJECTED");
            entity.setReason("Ödeme doğrulanamadı!");
            passToNext(null);
            System.out.println("Sipariş reddedildi: Ödeme doğrulanamadı");
        }

    }
}
