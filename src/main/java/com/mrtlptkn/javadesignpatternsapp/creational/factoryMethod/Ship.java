package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Denizyoluyla teslimat gerçekleştirildi (Ship)");
    }
}
