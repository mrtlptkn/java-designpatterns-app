package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Havayoluyla teslimat gerçekleştirildi (Airplane)");
    }
}
