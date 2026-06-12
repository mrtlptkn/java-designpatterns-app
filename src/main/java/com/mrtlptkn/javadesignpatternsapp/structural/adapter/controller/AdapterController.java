package com.mrtlptkn.javadesignpatternsapp.structural.adapter.controller;

import com.mrtlptkn.javadesignpatternsapp.structural.adapter.application.BankPaymentApplication;
import com.mrtlptkn.javadesignpatternsapp.structural.adapter.application.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adapter")
public class AdapterController {

    private final BankPaymentApplication bankPaymentApplication;


    public AdapterController(BankPaymentApplication bankPaymentApplication) {
        this.bankPaymentApplication = bankPaymentApplication;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> makePay(@RequestBody PaymentRequest request) {

        this.bankPaymentApplication.handle(request);
        return ResponseEntity.ok("Adapter ile odeme yapildi: ");
    }

}
