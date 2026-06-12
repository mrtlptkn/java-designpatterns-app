package com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeSmartTv implements BridgeSmartHomeDevice {
    @Override
    public void on() {
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void off() {
        System.out.println("Smart TV is turned OFF");
    }
}
