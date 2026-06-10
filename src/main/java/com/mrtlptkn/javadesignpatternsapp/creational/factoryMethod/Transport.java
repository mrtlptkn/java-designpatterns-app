package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;


// Ship,Truck,Airplane
// Transport tipinde sınıflar üretebilemk için
// bunları üreten bir logictic fabrikasına ihtiyacımız var
// Logistic fabrikasını tek bir görevi var. Transport tipinde nesneler üretmek.
// Taşımacılık Vasıtası üretim fabrikasıyız.

// Creation patternlerin ortak amacı, bir nesne üretimini yönetmek. new ile nesne yönetimini developerın if else komutları ile duruma göre yönetmesi yerine bunu akıllı başka sınıflar (factory) sınıfları üzerinden yapabilmek.

public interface Transport {

    void  deliver(); // taşıma işlemi
}
