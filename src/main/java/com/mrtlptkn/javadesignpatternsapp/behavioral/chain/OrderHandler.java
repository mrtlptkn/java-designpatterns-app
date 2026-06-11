package com.mrtlptkn.javadesignpatternsapp.behavioral.chain;



// Sipariş sürecinin yöneteceğimiz order request işleyecek olan sınıf
// Fraud Detection, Stock Check ve Payment Check -> Bu handler üzerinden akışı kontrol der
// Not: Behavioral Pattern olduğu için ilgili sınıflara özel sınıflar üretek sorumluluk yönetimi yapıyoruz.
// Generic bir sınıf yapayım tüm Handler süreçlerimde kullanayım bakış açısı burası için yanlış.
public abstract class OrderHandler {

    protected OrderHandler next;


    public OrderHandler setNext(OrderHandler next) {
        this.next = next;
        return next;
    }


    // Benim handle etmem gereken istek OrderRequest ama bu aşamada nasıl handle edeceğime dair bir fikrim yok.
    // Bu sebeple abstract method yaptık
    public  abstract void handle(OrderRequest order);


    // Order Handlerdan kalıtım alan sınıflarda bir sonraki zincire geçip geçemediğimizi kontrol etmek için yaptık. Next state yoksa artık zincir bitmiştir.
    protected void passToNext(OrderRequest order) {
        if (next != null) {
            next.handle(order);
        } else {
            System.out.println("Order Request steps are completed");
        }
    }

}
