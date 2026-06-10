package com.mrtlptkn.javadesignpatternsapp.creational.builder;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/builder")
public class BuilderController {


    @PostMapping("test")
    public ResponseEntity<String> test(){

        Pizza pizza1 = new PizzaBuilderImp("medium")
                .withExtraCheese()
                .withExtraMushroom()
                .withExtraOlives()
                .build();

        Pizza pizza2 = new PizzaBuilderImp("large")
                .withExtraCheese()
                .withExtraMushroom()
                .build();

        Pizza pizza3 = new PizzaBuilderImp("small")
                .withExtraOlives()
                .build();



        return ResponseEntity.ok("Builder pattern test endpoint");

    }


}
