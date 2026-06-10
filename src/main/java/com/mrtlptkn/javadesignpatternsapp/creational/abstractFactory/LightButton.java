package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button render edildi.");
    }
}
