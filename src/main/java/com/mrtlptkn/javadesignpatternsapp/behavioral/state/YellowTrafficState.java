package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public class YellowTrafficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenTraficState());
        System.out.println("[Sarı] -> Yeşile geçiliyor");
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getDescription() {
        return "Hazırda Bekle!";
    }

    @Override
    public boolean canTransitionTo(ITrafficLightState targetState) {
        String targetColor = targetState.getColor();
        return "Red".equals(targetColor) || "Green".equals(targetColor);
    }
}
