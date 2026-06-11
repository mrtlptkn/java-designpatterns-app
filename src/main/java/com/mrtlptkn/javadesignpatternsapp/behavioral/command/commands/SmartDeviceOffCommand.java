package com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers.SmartHomeDevice;

// Bu Komutlar Device tipinde tanımlı bir sınıf ile alakalıdır.
public class SmartDeviceOffCommand implements SmartDeviceCommand {

    private final SmartHomeDevice smartDevice;

    public SmartDeviceOffCommand(SmartHomeDevice smartDevice) {
        this.smartDevice = smartDevice;
    }


    @Override
    public void execute() {
            System.out.println("Device is turned off.");
            this.smartDevice.off();
    }
}
