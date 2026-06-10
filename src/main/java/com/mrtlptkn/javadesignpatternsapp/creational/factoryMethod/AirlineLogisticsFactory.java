package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

public class AirlineLogisticsFactory extends LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
