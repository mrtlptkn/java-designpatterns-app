package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRepository {

    public void save(){

         Order or = new Order();
         or.setOrderedAt(LocalDate.now());
         or.setShippedAt(LocalDate.now().plusDays(2));
         or.setCode("ORD123456");

         OrderLine orderLine = new OrderLine();
         orderLine.setLineTotal(BigDecimal.valueOf(100.0));
         orderLine.setOrderId(or.getId());
         orderLine.setProductId(1L);

        // SPring Data JPA Repository save

        System.out.println("Siparis veritabanina kaydedildi.");
    }

}
