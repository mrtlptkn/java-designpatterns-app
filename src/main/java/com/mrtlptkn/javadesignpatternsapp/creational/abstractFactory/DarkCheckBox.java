package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class DarkCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Dark CheckBox boyanıyor.");
    }
}
