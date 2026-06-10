package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class DarkThemeFactory implements UIThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
