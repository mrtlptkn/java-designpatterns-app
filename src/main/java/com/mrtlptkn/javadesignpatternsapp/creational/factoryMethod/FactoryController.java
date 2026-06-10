package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/factory")
public class FactoryController {


    @GetMapping("test")
    public ResponseEntity<String> test() {

        String type = "SeaLogistics";

        LogisticsFactory lf = switch (type) {
            case "RoadLogistics" -> new RoadLogisticsFactory();
            case "SeaLogistics"  -> new SeaLogisticsFactory();
            case "AirLogistics"  -> new AirlineLogisticsFactory();
            default             -> throw new IllegalArgumentException("Bilinmeyen tip: " + type + ". Geçerli değerler: RoadLogistics, SeaLogistics, AirLogistics");
        };


        lf.planDelivery();


        return  ResponseEntity.ok("OK");
    }

}
