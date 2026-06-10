package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Karayoluyla teslimat gerçekleştirildi (Truck)");
    }
}
