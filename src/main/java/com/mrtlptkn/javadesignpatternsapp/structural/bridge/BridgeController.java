package com.mrtlptkn.javadesignpatternsapp.structural.bridge;

import com.mrtlptkn.javadesignpatternsapp.structural.bridge.application.BridgeRemoteControlRequest;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.application.BridgeRemoteControllerAllDeviceApplication;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.application.BridgeRemoteControllerApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bridge")
public class BridgeController {

    private final BridgeRemoteControllerAllDeviceApplication bridgeRemoteControllerApplication;

    public BridgeController(BridgeRemoteControllerAllDeviceApplication brideRemoteControllerApplication) {
        this.bridgeRemoteControllerApplication = brideRemoteControllerApplication;
    }

    @PostMapping("/open")
    public ResponseEntity<String> open(@RequestBody BridgeRemoteControlRequest request) {

        this.bridgeRemoteControllerApplication.open(request);

        return ResponseEntity.ok("BRIDGE PATTERN - Opened Notification System");
    }

    @PostMapping("/close")
    public ResponseEntity<String> close(@RequestBody BridgeRemoteControlRequest request) {

        this.bridgeRemoteControllerApplication.close(request);

        return ResponseEntity.ok("BRIDGE PATTERN - Closed Notification System");
    }

}
