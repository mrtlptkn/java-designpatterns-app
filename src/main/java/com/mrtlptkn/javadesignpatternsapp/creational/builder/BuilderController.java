package com.mrtlptkn.javadesignpatternsapp.creational.builder;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/builder")
public class BuilderController {

    private  final  PizzaApplication pizzaApplication;

    public BuilderController(PizzaApplication pizzaApplication) {
        this.pizzaApplication = pizzaApplication;
    }


    @PostMapping("test")
    public ResponseEntity<String> test(){

        Pizza pizza1 = new PizzaBuilderImp("medium")
                .withExtraCheeses()
                .withExtraMushrooms()
                .withExtraOlives()
                .build();

        Pizza pizza2 = new PizzaBuilderImp("large")
                .withExtraCheeses()
                .withExtraMushrooms()
                .build();

        Pizza pizza3 = new PizzaBuilderImp("small")
                .withExtraOlives()
                .build();

        return ResponseEntity.ok("Builder pattern test endpoint");
    }


    @PostMapping("best")
    public ResponseEntity<String> test(@RequestBody PizzaRequest request){


        // Dinamik olarak bir pizza nesnesi oluşturduk.
        Pizza pizza = pizzaApplication.create(request);


        return ResponseEntity.ok("Builder pattern test endpoint");

    }

}
