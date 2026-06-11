package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/chain")
public class ChainController {

    private final OrderBestApplicationService orderApplicationService;

    public ChainController(OrderBestApplicationService orderProcessingService){
        this.orderApplicationService = orderProcessingService;
    }

    @PostMapping("test")
    public ResponseEntity<String> test(@RequestBody OrderRequest request){

        // {"basketCode":"ABC-123","customerNumber":"CS-100","isFraud":true,"isStockAvaible":true,"isPaymentVerified":true} -> dolandırıcılık şüphesi var ilk senaryo
        // {"basketCode":"ABC-123","customerNumber":"CS-100","isFraud":false,"isStockAvaible":false,"isPaymentVerified":true}
        // {"basketCode":"ABC-123","customerNumber":"CS-100","isFraud":false,"isStockAvailable":true,"isPaymentVerified":false} test case -> limit yetersiz
        this.orderApplicationService.submit(request);

        return ResponseEntity.ok("");
    }

}
