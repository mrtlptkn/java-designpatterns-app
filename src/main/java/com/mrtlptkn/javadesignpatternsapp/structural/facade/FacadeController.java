package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/facade")
public class FacadeController {

    private final OrderFacade orderFacade;

    public FacadeController(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @PostMapping("test")
    public ResponseEntity<String> test(){
        // Facadan bekletimiz bu.
        this.orderFacade.submitOrder();
        return ResponseEntity.ok("Facade pattern test endpoint");
    }

}
