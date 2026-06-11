package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

public interface ITrafficLightState {

    // TrafficLight bizim içinm bir context bu sebeple state değişimi bu context üzerinden olmalıdır.
    void next(TrafficLight trafficLight);

    // Yellow State -> Red yada Green geçemek için işime yarıyan bir özellik.
    String getColor();

    String getDescription();

}
