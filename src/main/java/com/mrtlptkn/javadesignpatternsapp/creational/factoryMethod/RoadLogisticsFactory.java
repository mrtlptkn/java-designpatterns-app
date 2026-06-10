package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class RoadLogisticsFactory extends LogisticsFactory {


    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
