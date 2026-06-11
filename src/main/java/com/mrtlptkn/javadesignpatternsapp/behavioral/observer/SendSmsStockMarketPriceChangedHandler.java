package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import org.springframework.stereotype.Component;

@Component
public class SendSmsStockMarketPriceChangedHandler implements IStockMarketSubsciber {


    @Override
    public void update(StockMarket stockMarket) {
        System.out.println("Stock market price changed. Sending SMS to subscribers: " + stockMarket.getPrice());
    }
}
