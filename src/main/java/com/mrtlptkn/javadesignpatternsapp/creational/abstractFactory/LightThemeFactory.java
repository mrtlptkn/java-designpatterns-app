package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;


// Bu sınıfın amacı gerçekten bize light concrete product üretmek.
public class LightThemeFactory implements UIThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
