package com.mrtlptkn.javadesignpatternsapp.behavioral.command.invokers;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands.SmartDeviceOffCommand;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands.SmartDeviceOnCommand;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers.SmartTv;
import org.springframework.stereotype.Component;

// Telefvizyon kumandası
@Component
public class MultiTouchRemoteController implements RemoteController {
    @Override
    public void open() {

        // TV kumandasından open bastığımızda -> SmartTv çalıştırmak istiyoruz
        SmartDeviceOnCommand command = new SmartDeviceOnCommand(new SmartTv());
        command.execute(); // smart Tv açmayı tetikledim
        System.out.println("MultiTouch Remote");
    }

    @Override
    public void close() {
        // TV kumandasından close bastığımda SmartTv kapatmak istiyorum.
        SmartDeviceOffCommand command = new SmartDeviceOffCommand(new SmartTv());
        command.execute(); // smart Tv kapatmayı tetikledim
        System.out.println("MultiTouch Remote");
    }
}
