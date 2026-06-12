package com.mrtlptkn.javadesignpatternsapp.structural.decorator;

import java.math.BigDecimal;

// decore edilecek yeni özellikler ile fiyatoı değişecek olan
// ürünün abstractı
public interface Beverage {
    BigDecimal getCost();
    String getDescription();
}
