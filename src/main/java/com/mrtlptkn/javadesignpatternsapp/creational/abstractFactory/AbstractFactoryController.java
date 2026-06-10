package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/abstract-factory")
public class AbstractFactoryController {


    @PostMapping("test")
    public ResponseEntity<String> test(@RequestBody ThemeRequestDto dto){

        UIThemeFactory factory = switch (dto.themeType()){
            case "LightTheme" -> new LightThemeFactory();
            case "DarkTheme"  -> new DarkThemeFactory();
            default          -> throw new IllegalArgumentException("Bilinmeyen tema tipi: " + dto.themeType());
        };

        // Ortak amaç factory sayısı her zaman o factornin ürettiği karmaşık ürün sayısından daha az olacaktır.
        // aslında ürünü üretmek için fabrikasını bilmem yeterli.

        Button btn =  factory.createButton();
        btn.render(); // LightButton Render

        CheckBox checkBox = factory.createCheckBox();
        checkBox.render(); // LightCheckBox Render


        // Button btnSample = new DarkButton(); // bunu factory üzerinden otomatik üretiyorum.
        // if(factoryType.equals("DarkTheme")){
        //     btnSample = new DarkButton();
        // } else if(factoryType.equals("LightTheme")){
        //     btnSample = new LightButton();
        // }
        //Button btn2 = factory.createButton(); // DarkButton Talebi.
        //btn2.render(); // DarkButton Render


        return ResponseEntity.ok("Abstract Factory pattern test endpoint");
    }

}
