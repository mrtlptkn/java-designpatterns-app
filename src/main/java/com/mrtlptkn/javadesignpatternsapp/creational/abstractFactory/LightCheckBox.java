package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class LightCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Light CheckBox oluşturuldu.");
    }
}
