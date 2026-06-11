package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public class GreenTraficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowTrafficState());
        System.out.println("[Yeşil] -> Sarıya geçiliyor");
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getDescription() {
        return "Hızlan! Geç!";
    }

    @Override
    public boolean canTransitionTo(ITrafficLightState targetState) {
        return "Yellow".equals(targetState.getColor());
    }
}
