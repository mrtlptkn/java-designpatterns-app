package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TrafficLightApplication {

    private final TrafficLight trafficLight;

    public TrafficLightApplication(TrafficLight trafficLight) {

        this.trafficLight = trafficLight;
    }

    public void handle(TrafficLightRequest request){


        this.trafficLight.setState(switch (request.color().toUpperCase()) {
            case "RED" -> new RedTrafficState();
            case "GREEN" -> new GreenTraficState();
            case "YELLOW" -> new YellowTrafficState();
            default -> throw new IllegalArgumentException("Invalid traffic light color: " + request.color());
        });
        System.out.println("Current Traffic Light State: " + trafficLight.getState().getColor());


    }

}
