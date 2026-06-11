package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TrafficLight {

    private ITrafficLightState state;

    public TrafficLight() {
        // initial State
        this.state = new RedTrafficState();
    }

    // Current State -> RED -> Dinamik olarak State nesneleri üzerinden değişim gösterecek.
    public ITrafficLightState getState() {
        return state;
    }

    // set State ile farklı bir state geçiyoruz.
    public void setState(ITrafficLightState state) {
        this.state = state;
    }
}
