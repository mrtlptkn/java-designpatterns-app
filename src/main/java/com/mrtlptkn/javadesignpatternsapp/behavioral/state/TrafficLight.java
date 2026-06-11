package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import org.springframework.stereotype.Component;

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
    public void setState(ITrafficLightState state)
    {
        // State değişmesi için bir koşulun oluşması gerekiyor diye bir kontrol yaptık.
        if (!this.state.canTransitionTo(state)) {
            System.out.println(this.state.cannotTransitionMessage(state));
            return;
        }

        this.state = state;
    }
}
