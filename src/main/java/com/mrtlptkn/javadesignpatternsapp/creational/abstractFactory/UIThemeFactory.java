package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

// Abstract Factory
public interface UIThemeFactory {
    Button createButton();
    TextField createTextField();
    CheckBox createCheckBox();
}


