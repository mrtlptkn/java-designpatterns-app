package com.mrtlptkn.javadesignpatternsapp.creational.factoryMethod;

// Logictics sınıfı Tranport sınıfı direk bağlı değil. DIP prensibede uygun hareket ettik.
public abstract class LogisticsFactory {

    public abstract Transport createTransport();

    // PlanDelivery doğru Tranportun instance yönetiminin yapığını ekranda görmek için tanımlanmış bir method.
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }


}
