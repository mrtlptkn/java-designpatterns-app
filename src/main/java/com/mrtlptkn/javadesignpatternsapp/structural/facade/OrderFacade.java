package com.mrtlptkn.javadesignpatternsapp.structural.facade;


// Sipariş denilen şey aslında bir subsystem hiyerarşik yapısı
// Sisteme bir sipariş düştüğünde
// InventoryService -> Stock Rezerve Etmemiz Lazım
// PaymentService -> Ödeme Kanalları
// ShipmentService -> Kargo servis
// Notification -> Sipariş ve Diğer alt süreçler ile ilgili birdirimler


import org.springframework.stereotype.Component;

// Facade aslında bu tarz tüm subsystemsların birleştirildiği koordine edildiği tüm parçaların tek bir merkezden yönetildiği bir servis konumunda olduğunda kullanılır. Yani birden fazla subsystem var ve bu subsystemsların birbirleriyle ilişkili olduğu durumlarda tek bir merkezden yönetmek istediğimizde kullanırız. Application Class olarak karşımıza çıkar.
// OrderFacade = OrderingApplication

@Component
public class OrderFacade {

    // SubSystems
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShipmentService shipmentService;
    private final NotificationService notificationService;

    public OrderFacade(InventoryService inventoryService, PaymentService paymentService, ShipmentService shipmentService, NotificationService notificationService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shipmentService = shipmentService;
        this.notificationService = notificationService;
    }

    public void submitOrder(){

        boolean stockExist =  inventoryService.checkStock();

        if(stockExist)
            inventoryService.reserveStock(10);
        else
            throw  new IllegalStateException("Stock is not enough");

        paymentService.pay();
        shipmentService.start();
        notificationService.sendNotification();
    }



}
