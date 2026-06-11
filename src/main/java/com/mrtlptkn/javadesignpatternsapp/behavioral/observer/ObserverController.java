package com.mrtlptkn.javadesignpatternsapp.behavioral.observer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/observer")
public class ObserverController {

    private final StockMarketApplication stockMarketApplication;

    public ObserverController(StockMarketApplication stockMarketApplication) {
        this.stockMarketApplication = stockMarketApplication;
    }


    @PostMapping("updatePrice")
    public ResponseEntity<String> updatePrice(@RequestBody StockMarketRequest request){
        stockMarketApplication.handle(request);
        return  ResponseEntity.ok("Stock price updated:");
    }


}
