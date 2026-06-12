package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import java.math.BigDecimal;

public class MilkDecorator extends BeverageDecorator {


    protected MilkDecorator(Beverage wrapper) {
        super(wrapper);
    }

    @Override
    public BigDecimal getCost() {
        return wrapper.getCost().multiply(BigDecimal.valueOf(1.1));
    }

    @Override
    public String getDescription() {
        return "" + wrapper.getDescription() + " + with Milk";
    }
}
