package com.mrtlptkn.javadesignpatternsapp.structural.bridge.application;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.MultiTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.OneTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.RemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeMultiTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeOneTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.structural.bridge.invokers.BridgeRemoteController;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// Şuan bu uygulama milyon farklı SmartHomeDevice tipindeki SmartDevice ile
// milyon faklı RemoteController tipindeki kumanda ile çalışabilir durumda. Çünkü RemoteControllerApplication sınıfında RemoteController tipinde bir map oluşturduk ve bu map'e istediğimiz kadar RemoteController ekleyebiliriz.

@Component
public class BridgeRemoteControllerApplication {

    private final Map<String, BridgeRemoteController> remoteControllerMap = new HashMap<>();
    // eğer request göre hangi sınıfın çalışacağına smartFridge mi yoksa smartTv mi device olarak seçilecek karar vermek istersem.

    public BridgeRemoteControllerApplication(BridgeMultiTouchRemoteController multiTouchRemoteController, BridgeOneTouchRemoteController oneTouchRemoteController) {
        this.remoteControllerMap.put("MultiTouch",multiTouchRemoteController);
        this.remoteControllerMap.put("OneTouch",oneTouchRemoteController);
        // yeni bir özellik ekleyince sadece buraya ilgili sınıfı ekle yeterli.
    }

    public void  open(BridgeRemoteControlRequest request){

        if(remoteControllerMap.containsKey(request.remoteControlType())){
           BridgeRemoteController controller =  remoteControllerMap.get(request.remoteControlType());
           controller.open();
        }
    }

    public void  close(BridgeRemoteControlRequest request){

        if(remoteControllerMap.containsKey(request.remoteControlType())){
            BridgeRemoteController controller =  remoteControllerMap.get(request.remoteControlType());
            controller.close();
        }
    }


}
