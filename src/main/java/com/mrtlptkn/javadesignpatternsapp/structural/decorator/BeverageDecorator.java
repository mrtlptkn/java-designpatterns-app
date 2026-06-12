package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

// Base Beverage içerisinde ekstra hiçbir malzeme olmayan en saf hali ile içeriği kullanmak için
// kullandığımız abstract sınıf
// Oluşturulacak farklı varsyondaki içecekler bu classdan kalıtım alacak.
public abstract class BeverageDecorator implements Beverage {
    protected final Beverage wrapper;

    protected BeverageDecorator(Beverage wrapper) {
        this.wrapper = wrapper;
    }

}
