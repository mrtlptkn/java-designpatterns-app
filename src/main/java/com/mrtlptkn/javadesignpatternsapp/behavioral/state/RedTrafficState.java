package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public class RedTrafficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {

        if(trafficLight.getState().getColor().equals("Yellow")) {
            trafficLight.setState(new YellowTrafficState());
            System.out.println("[Kırmızı] → Sarıya geçiliyor");
        } else {
            throw new IllegalStateException("Kırmızı durumundan sadece sarıya geçilebilir!");
        }
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getDescription() {
        return "Yavaşla! Dur!";
    }
}
