package com.mrtlptkn.javadesignpatternsapp.creational.abstractFactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Dark Button rendered with dark theme.");
    }
}
