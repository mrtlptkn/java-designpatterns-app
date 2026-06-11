package com.mrtlptkn.javadesignpatternsapp.behavioral.command.recievers;

public class SmartFridge implements SmartHomeDevice{
    @Override
    public void on() {
        System.out.println("Smart Fridge is now ON. Cooling started.");
    }

    @Override
    public void off() {
        System.out.println("Smart Fridge is now OFF. Cooling stopped.");
    }
}
