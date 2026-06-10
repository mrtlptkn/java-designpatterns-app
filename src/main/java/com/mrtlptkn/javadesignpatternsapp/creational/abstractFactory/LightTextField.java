package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Light temalı TextField oluşturuldu.");
    }
}
