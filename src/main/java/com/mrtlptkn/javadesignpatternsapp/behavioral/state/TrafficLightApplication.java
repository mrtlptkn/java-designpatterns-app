package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TrafficLightApplication {

    private final Map<String, ITrafficLightState> states = new HashMap<>();

    public TrafficLightApplication() {
        states.put("Red", new RedTrafficState());
        states.put("Yellow", new YellowTrafficState());
        states.put("Green", new GreenTraficState());
    }

    public void handle(TrafficLightRequest request){

        if(states.containsKey(request.color())){
            System.out.println("Traffic Light State: " + request.color());
        }else {
            System.out.println("Invalid Traffic Light State: " + request.color());
            return;
        }

        ITrafficLightState state = states.get(request.color()); // RED, GREEN VEYA YELLOW
        state.next(new TrafficLight()); // Bir sonraki state transition geçiş yap.
    }

}
