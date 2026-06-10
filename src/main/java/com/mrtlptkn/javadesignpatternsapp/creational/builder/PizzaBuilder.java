package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// aşağıdaki ekstra özelliklerde bir pizza oluşturmak istiyoruz.

public interface PizzaBuilder {

    PizzaBuilder withExtraCheese();
    PizzaBuilder withExtraMushroom();
    PizzaBuilder withExtraOlives();

    Pizza build();


}
