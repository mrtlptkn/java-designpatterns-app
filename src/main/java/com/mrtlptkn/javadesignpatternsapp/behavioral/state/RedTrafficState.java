package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public class RedTrafficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowTrafficState());
        System.out.println("[Kırmızı] -> Sarıya geçiliyor");
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getDescription() {
        return "Yavaşla! Dur!";
    }

    @Override
    public boolean canTransitionTo(ITrafficLightState targetState) {
        return "Yellow".equals(targetState.getColor());
    }
}
