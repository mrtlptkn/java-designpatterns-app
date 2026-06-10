package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// Pizza nesnesindeki extra alanları set etmek için
// PizzaBuilder nesnesinden yararlanıyoruz.

public class Pizza {
    // extra peynirli mi ?
    private boolean extraCheeses;
    private boolean extraMushrooms;
    private  boolean extraOlives;
    // medium, large, x-large, small
    private final String size;

    public Pizza(String size){
        this.size = size;
    }


    public boolean getExtraCheeses() {
        return extraCheeses;
    }

    public void setExtraCheese() {
        this.extraCheeses = true;
    }


    public boolean getExtraMushrooms() {
        return extraMushrooms;
    }

    public void setExtraMushroom() {
        this.extraMushrooms = true;
    }


    public boolean getExtraOlives() {
        return extraOlives;
    }

    public void setExtraOlives() {
       this.extraOlives = true;
    }
}
