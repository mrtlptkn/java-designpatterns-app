package com.mrtlptkn.javadesignpatternsapp.behavioral.strategy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/strategy")
public class StrategyController {

    private final CommissionApplication commissionApplication;


    public StrategyController(CommissionApplication commissionApplication) {
        this.commissionApplication = commissionApplication;
    }


    @PostMapping("test")
    public ResponseEntity<String> test(@RequestBody CommissionRequest request){
        commissionApplication.handle(request);
        return ResponseEntity.ok("Commission for " + request.enterprise());
    }

}
