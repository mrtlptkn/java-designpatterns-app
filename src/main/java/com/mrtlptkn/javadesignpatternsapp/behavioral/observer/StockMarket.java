package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Component
public class StockMarket {

    @Getter
    private BigDecimal price = BigDecimal.valueOf(0); // fiyat

    @Getter
    @Setter
    private String name; // isim
    private final List<IStockMarketSubsciber> subscibers = new ArrayList<>();




    public void changePrice(BigDecimal newPrice){
       this.price = newPrice;
        // event ise fiyatın güncellenmesi
        notifySubscibers();
    }

    // fiyat değişimde tüm subsciberları tetikleyen method.
    public void notifySubscibers(){
        for (IStockMarketSubsciber subsciber : subscibers) {
            subsciber.update(this);
        }
    }


    // yeni bir gözlemci ekliyoruz.
    public void addSubsciber(IStockMarketSubsciber subsciber){
        subscibers.add(subsciber);
    }

    // işimiz bitinci gömlemleyicileri ortadan kaldırıyoruz.
    public void removeSubsciber(IStockMarketSubsciber subsciber){
        subscibers.remove(subsciber);
    }


}
