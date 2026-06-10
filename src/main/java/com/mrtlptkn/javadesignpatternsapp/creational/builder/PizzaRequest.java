package com.mrtlptkn.javadesignpatternsapp.creational.builder;

// Buda Application sınıfna son kullanıcının göndermiş oludğu değeri temsil eder
public record PizzaRequest(String size,Boolean extraCheeses, Boolean extraMushrooms, Boolean extraOlives) {

}
