package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.stereotype.Component;

@Component
public class StockCheckHandler extends OrderHandler {
    @Override
    public void handle(OrderRequest orderRequest) {

        if(!orderRequest.isStockAvailable()){
            Order entity = new Order();
            entity.setStatus("REJECTED");
            entity.setReason("Stokta yeterli ürün bulunmamaktadır!");
            System.out.println("Sipariş reddedildi: Stokta yeterli ürün yok");
        } else {
            passToNext(orderRequest);
            System.out.println("Stok kontrolü başarılı. Sonraki adıma geçiliyor.");
        }
    }
}
