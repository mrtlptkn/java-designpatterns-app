package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// aşağıdaki ekstra özelliklerde bir pizza oluşturmak istiyoruz.

public interface PizzaBuilder {

    PizzaBuilder withExtraCheeses();
    PizzaBuilder withExtraMushrooms();
    PizzaBuilder withExtraOlives();

    Pizza build();


}
