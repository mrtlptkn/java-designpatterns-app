package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// Pizza nesnesindeki extra alanları set etmek için
// PizzaBuilder nesnesinden yararlanıyoruz.

public class Pizza {
    // extra peynirli mi ?
    private boolean extraCheese;
    private boolean extraMushroom;
    private  boolean extraOlives;
    // medium, large, x-large, small
    private final String size;

    public Pizza(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public boolean getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese() {
        this.extraCheese = true;
    }


    public boolean getExtraMushroom() {
        return extraMushroom;
    }

    public void setExtraMushroom() {
        this.extraMushroom = true;
    }


    public boolean getExtraOlives() {
        return extraOlives;
    }

    public void setExtraOlives() {
       this.extraOlives = true;
    }
}
