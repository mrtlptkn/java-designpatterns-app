package com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands.SmartDeviceOffCommand;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands.SmartDeviceOnCommand;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers.SmartTv;
import org.springframework.stereotype.Component;

@Component
public class OneTouchRemoteController implements RemoteController {
    @Override
    public void open() {
        System.out.println("3sn bekleme süresi var");
        System.out.println("OneTouch Remote");
        // TV kumandasından open bastığımızda -> SmartTv çalıştırmak istiyoruz
        SmartDeviceOnCommand command = new SmartDeviceOnCommand(new SmartTv());
        command.execute(); // smart Tv açmayı tetikledim
    }

    @Override
    public void close() {

        System.out.println("5sn bekleme süresi var");
        System.out.println("OneTouch Remote");

        // TV kumandasından open bastığımızda -> SmartTv çalıştırmak istiyoruz
        SmartDeviceOffCommand command = new SmartDeviceOffCommand(new SmartTv());
        command.execute(); // smart Tv açmayı tetikledim
    }
}
