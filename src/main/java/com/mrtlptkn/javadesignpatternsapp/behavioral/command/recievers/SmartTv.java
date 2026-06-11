package com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers;

public class SmartTv implements SmartHomeDevice {
    @Override
    public void on() {
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void off() {
        System.out.println("Smart TV is turned OFF");
    }
}
