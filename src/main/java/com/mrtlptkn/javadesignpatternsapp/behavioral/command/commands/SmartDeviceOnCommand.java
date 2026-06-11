package com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers.SmartHomeDevice;

public class SmartDeviceOnCommand implements SmartDeviceCommand {

    private final SmartHomeDevice smartHomeDevice;

    public SmartDeviceOnCommand(SmartHomeDevice smartHomeDevice) {
        this.smartHomeDevice = smartHomeDevice;
    }


    @Override
    public void execute() {
        System.out.println("Device is turned ON.");
        this.smartHomeDevice.on();
    }
}
