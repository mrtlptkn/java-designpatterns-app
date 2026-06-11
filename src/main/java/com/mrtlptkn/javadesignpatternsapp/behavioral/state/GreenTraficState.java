package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public class GreenTraficState implements ITrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {

        if(trafficLight.getState().getColor().equals("Yellow")){
            trafficLight.setState(new YellowTrafficState());
            System.out.println("[Yeşil] → Sarıya geçiliyor");
        } else {
            throw new IllegalStateException("Yeşil durumundan sadece sarıya geçilebilir!");
        }
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getDescription() {
        return "Hızlan! Geç!";
    }
}
