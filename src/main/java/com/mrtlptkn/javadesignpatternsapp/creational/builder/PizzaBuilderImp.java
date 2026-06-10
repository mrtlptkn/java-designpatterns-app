package com.mrtlptkn.javadesignpatternsapp.creational.builder;

public class PizzaBuilderImp implements PizzaBuilder {

    private final Pizza pizza;

    public PizzaBuilderImp(String size){
        this.pizza = new Pizza(size);
    }

    @Override
    public PizzaBuilder withExtraCheese() {
        this.pizza.setExtraCheese();
        return this;
    }

    @Override
    public PizzaBuilder withExtraMushroom() {
        this.pizza.setExtraMushroom();
        return this;
    }

    @Override
    public PizzaBuilder withExtraOlives() {
        this.pizza.setExtraOlives();
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizza;
    }
}
