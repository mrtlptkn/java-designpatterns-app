package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Koyu temalı bir metin kutusu oluşturuldu.");
    }
}
