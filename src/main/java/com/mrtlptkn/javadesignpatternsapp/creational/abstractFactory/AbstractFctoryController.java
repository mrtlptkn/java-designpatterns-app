package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/abstract-factory")
public class AbstractFctoryController {


    @GetMapping("test")
    public ResponseEntity<String> test(){

        String factoryType = "LightTheme";

        UIThemeFactory factory = switch (factoryType){
            case "LightTheme" -> new LightThemeFactory();
            case "DarkTheme"  -> new DarkThemeFactory();
            default          -> throw new IllegalArgumentException("Bilinmeyen tema tipi: " + factoryType);
        };

        // Ortak amaç factory sayısı her zaman o factornin ürettiği karmaşık ürün sayısından daha az olacaktır.
        // aslında ürünü üretmek için fabrikasını bilmem yeterli.

        Button btn =  factory.createButton();
        btn.render(); // LightButton Render

        factoryType= "DarkTheme";

        // Button btnSample = new DarkButton(); // bunu factory üzerinden otomatik üretiyorum.
        // if(factoryType.equals("DarkTheme")){
        //     btnSample = new DarkButton();
        // } else if(factoryType.equals("LightTheme")){
        //     btnSample = new LightButton();
        // }
        Button btn2 = factory.createButton(); // DarkButton Talebi.
        btn2.render(); // DarkButton Render


        return ResponseEntity.ok("Abstract Factory pattern test endpoint");
    }

}
