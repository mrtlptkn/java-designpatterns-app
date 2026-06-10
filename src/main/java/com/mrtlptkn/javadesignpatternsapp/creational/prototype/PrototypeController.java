package com.mrtlptkn.javadesignpatternsapp.creational.prototype;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/prototype")
public class PrototypeController {

    @PostMapping("test")
    public ResponseEntity<String> test(){

        List<String> inventory = new ArrayList<>();
        inventory.add("Katana");

        // g1 heap referansı ile g2 heap referansı aynı referns olur. bir değer değişince aynı referansa baktığından dolayı g2 de değişir. Normal ama eğer doğru copy yaptıysak o zaman bundan etkilenmeyiz yeni bir referans oluşur. g2 ile g1 referansı aynı olmaz.
        GameCharacter g1 = new GameCharacter("Warrior", 100, 50,inventory);
        GameCharacter g2 = g1.clone();
        g2.setHealth(25);

        return  ResponseEntity.ok("");
    }

}
