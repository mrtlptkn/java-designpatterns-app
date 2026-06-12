package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/decorator")
public class DecoratorController {

    private final BeverageApplication beverageApplication;

    public DecoratorController(BeverageApplication beverageApplication) {
        this.beverageApplication = beverageApplication;
    }


    @PostMapping("test")
    public ResponseEntity<String> test(){
        beverageApplication.submitBeverage();
        return ResponseEntity.ok("Decorator pattern test successful!");
    }

}
