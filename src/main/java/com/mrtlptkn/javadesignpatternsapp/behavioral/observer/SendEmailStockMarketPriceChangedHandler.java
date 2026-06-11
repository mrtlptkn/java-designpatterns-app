package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import org.springframework.stereotype.Component;

@Component
public class SendEmailStockMarketPriceChangedHandler implements IStockMarketSubsciber {
    @Override
    public void update(StockMarket stockMarket) {
        System.out.println("Sending email to subscribers about stock market price change. Current price: " + stockMarket.getPrice());
    }
}
