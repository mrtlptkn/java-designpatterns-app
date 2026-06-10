package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// Solid Prensiplerine aykırı br davranış var
// Ama kohezyon açısından bir sorun teşkil etmiyor.


public class PizzaBuilderImp implements PizzaBuilder {

    private final Pizza pizza;

    public PizzaBuilderImp(String size){
        this.pizza = new Pizza(size);
    }

    @Override
    public PizzaBuilder withExtraCheeses() {
        this.pizza.setExtraCheese();
        return this;
    }

    @Override
    public PizzaBuilder withExtraMushrooms() {
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
