package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class ShipmentService {
    public void start(){
        System.out.println("Gonderi baslatildi.");
    }
}
