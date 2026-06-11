package com.mrtlptkn.javadesignpatternsapp.behavioral.state;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/state")
public class StateController {

    private final TrafficLightApplication trafficLightApplication;

    public StateController(TrafficLightApplication trafficLightApplication) {
        this.trafficLightApplication = trafficLightApplication;
    }


    // Kırmızı ile başladık.
    // {"color":"yellow"}
    // {"color":"greeen"}
    @PostMapping("test")
    public ResponseEntity<String> test(@RequestBody TrafficLightRequest request){
        this.trafficLightApplication.handle(request);
        return  ResponseEntity.ok("State Design Pattern");
    }


}
