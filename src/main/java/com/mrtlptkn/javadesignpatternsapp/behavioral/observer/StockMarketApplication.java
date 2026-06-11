package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// Application katmanı conmtroller gelen isteğe göre arka plandaki sınıflara ait hazırlıkları yapar. Application class ismi vermemizin sebebi bu.
@Component
public class StockMarketApplication {

    private  final SendEmailStockMarketPriceChangedHandler sendEmailStockMarketPriceChangedHandler;
    private  final SendSmsStockMarketPriceChangedHandler sendSmsStockMarketPriceChangedHandler;

    private final StockMarket stockMarket;


    public StockMarketApplication(SendEmailStockMarketPriceChangedHandler sendEmailStockMarketPriceChangedHandler, SendSmsStockMarketPriceChangedHandler sendSmsStockMarketPriceChangedHandler, StockMarket stockMarket) {


        this.sendEmailStockMarketPriceChangedHandler = sendEmailStockMarketPriceChangedHandler;
        this.sendSmsStockMarketPriceChangedHandler = sendSmsStockMarketPriceChangedHandler;
        this.stockMarket = stockMarket; // Stock Market singleton instance
        // subscriberlerı ayağa kaldırdık

    }

    public void handle(StockMarketRequest request){
        System.out.println("Updating stock price to: " + request.newPrice());
        // talep öncesi eklet
        stockMarket.addSubsciber(sendEmailStockMarketPriceChangedHandler);
        stockMarket.addSubsciber(sendSmsStockMarketPriceChangedHandler);

        this.stockMarket.changePrice(request.newPrice());

        // Singleton instance aldığımız için bunu yaparsak 2.gönderimde eventler tetiklenmez.
        // talep sonrası kaldır.
        this.stockMarket.removeSubsciber(sendEmailStockMarketPriceChangedHandler);
        this.stockMarket.removeSubsciber(sendSmsStockMarketPriceChangedHandler);
    }

}
