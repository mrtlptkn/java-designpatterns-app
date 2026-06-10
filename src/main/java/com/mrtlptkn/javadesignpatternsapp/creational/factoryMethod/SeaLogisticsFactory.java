package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class SeaLogisticsFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
