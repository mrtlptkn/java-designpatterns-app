package com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Implementation
@Component
public class BridgeSmartFridge implements BridgeSmartHomeDevice {
    @Override
    public void on() {
        System.out.println("Smart Fridge is now ON. Cooling started.");
    }

    @Override
    public void off() {
        System.out.println("Smart Fridge is now OFF. Cooling stopped.");
    }
}
