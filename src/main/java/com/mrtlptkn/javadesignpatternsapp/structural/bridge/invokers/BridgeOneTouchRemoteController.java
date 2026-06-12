package com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers;

import com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers.BridgeSmartHomeDevice;
import org.springframework.stereotype.Component;

@Component
public class BridgeOneTouchRemoteController implements BridgeRemoteController {

    private final BridgeSmartHomeDevice device;

    public BridgeOneTouchRemoteController(BridgeSmartHomeDevice smartHomeDevice) {
        this.device = smartHomeDevice;
    }


    @Override
    public void open() {
        System.out.println("One Touch Remote: Cihaz aciliyor...");
        device.on();
    }

    @Override
    public void close() {
        System.out.println("One Touch Remote: Cihaz kapatiliyor...");
        device.off();
    }
}
