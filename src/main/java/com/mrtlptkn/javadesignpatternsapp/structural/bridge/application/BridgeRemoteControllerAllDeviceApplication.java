package com.mrtlptkn.javadesignpatternsapp.structural.bridge.application;

import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeMultiTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeOneTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeRemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers.BridgeSmartFridge;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers.BridgeSmartHomeDevice;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.recievers.BridgeSmartTv;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BridgeRemoteControllerAllDeviceApplication {

    // Request based sıfırlanır -> Method request bazlı
    private final Map<String, BridgeRemoteController> remoteControllerMap = new HashMap<>();
    // request based contructor sıfırlanır
    private final Map<String, BridgeSmartHomeDevice> devices = new HashMap<>();

     public BridgeRemoteControllerAllDeviceApplication(){


         // Sistemdeki tüm devicelar sisteme tanımlanır
         devices.put("smartFridge",new BridgeSmartFridge());
         devices.put("smartTv",new BridgeSmartTv());
     }


    public void  open(BridgeRemoteControlRequest request){

        if(!devices.containsKey(request.deviceName()))
            throw new IllegalStateException("Bu cihaz bulunamadi: " + request.deviceName());

        // İstek atılan device, devices listesinden remote controller ile haberleşmek için bulunur
        BridgeSmartHomeDevice device = devices.get(request.deviceName());

        // Sistemdeki tüm remote controller burada tanımlanır.
        BridgeRemoteController controller1 = new BridgeOneTouchRemoteController(device);
        BridgeRemoteController controller2 = new BridgeMultiTouchRemoteController(device);

        remoteControllerMap.put("OneTouch", controller1);
        remoteControllerMap.put("MultiTouch", controller2);


        if(remoteControllerMap.containsKey(request.remoteControlType())){
            BridgeRemoteController controller =  remoteControllerMap.get(request.remoteControlType());
            controller.open();
        }
    }

    public void  close(BridgeRemoteControlRequest request){

        if(!devices.containsKey(request.deviceName()))
            throw new IllegalStateException("Bu cihaz bulunamadi: " + request.deviceName());

        // İstek atılan device, devices listesinden remote controller ile haberleşmek için bulunur
        BridgeSmartHomeDevice device = devices.get(request.deviceName());

        // Sistemdeki tüm remote controller burada tanımlanır.
        BridgeRemoteController controller1 = new BridgeOneTouchRemoteController(device);
        BridgeRemoteController controller2 = new BridgeMultiTouchRemoteController(device);

        remoteControllerMap.put("OneTouch", controller1);
        remoteControllerMap.put("MultiTouch", controller2);


        if(remoteControllerMap.containsKey(request.remoteControlType())){
            BridgeRemoteController controller =  remoteControllerMap.get(request.remoteControlType());
            controller.close();
        }
    }


}
