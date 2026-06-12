package com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers;

import com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers.BridgeSmartHomeDevice;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Dependecy Inversion Prensibene uyar.
// Aynı zamanda OCP de uyar. Bir operasyonu asbtraction üzerinden farklı sınıflara dağırma prensibi.
// kodda değişim yok, gelişim çok
@Component
@Primary
public class BridgeMultiTouchRemoteController implements BridgeRemoteController {

    // Bridge
    // Herhangi bir remoteController'ün herhangi bir smart device ile köprü kurmasını abstraction üzerinden yapar.
    private final BridgeSmartHomeDevice smartHomeDevice;

    public BridgeMultiTouchRemoteController(BridgeSmartHomeDevice smartDevice) {
        this.smartHomeDevice = smartDevice;
    }


    @Override
    public void open() {
        System.out.println("Multi Touch Remote Controller: Cihaz aciliyor...");
        this.smartHomeDevice.on();
    }

    @Override
    public void close() {
        System.out.println("Multi Touch Remote Controller: Cihaz kapatiliyor...");
        this.smartHomeDevice.off();
    }
}
