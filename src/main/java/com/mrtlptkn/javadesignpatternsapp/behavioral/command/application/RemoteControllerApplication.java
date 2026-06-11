package com.mrtlptkn.javadesignpatternsapp.behavioral.command.application;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.MultiTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.OneTouchRemoteController;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers.RemoteController;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// Şuan bu uygulama milyon farklı SmartHomeDevice tipindeki SmartDevice ile
// milyon faklı RemoteController tipindeki kumanda ile çalışabilir durumda. Çünkü RemoteControllerApplication sınıfında RemoteController tipinde bir map oluşturduk ve bu map'e istediğimiz kadar RemoteController ekleyebiliriz.

@Component
public class RemoteControllerApplication {

    private final Map<String, RemoteController> remoteControllerMap = new HashMap<>();


    public RemoteControllerApplication() {
        this.remoteControllerMap.put("MultiTouch",new MultiTouchRemoteController());
        this.remoteControllerMap.put("OneTouch",new OneTouchRemoteController());
        // yeni bir özellik ekleyince sadece buraya ilgili sınıfı ekle yeterli.
    }

    public void  open(RemoteControlRequest request){

        if(remoteControllerMap.containsKey(request.remoteControlType())){
           RemoteController controller =  remoteControllerMap.get(request.remoteControlType());
           controller.open();
        }
    }

    public void  close(RemoteControlRequest request){

        if(remoteControllerMap.containsKey(request.remoteControlType())){
            RemoteController controller =  remoteControllerMap.get(request.remoteControlType());
            controller.close();
        }
    }


}
