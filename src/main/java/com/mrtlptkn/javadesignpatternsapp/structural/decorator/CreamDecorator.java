package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import java.math.BigDecimal;

public class CreamDecorator extends BeverageDecorator {


    protected CreamDecorator(Beverage wrapper) {
        super(wrapper);
    }

    @Override
    public BigDecimal getCost() {
       return wrapper.getCost().multiply(BigDecimal.valueOf(1.2)); // yüzde 20 ekledik

    }

    @Override
    public String getDescription() {
        return "" + wrapper.getDescription() + " + with Cream";
    }
}
