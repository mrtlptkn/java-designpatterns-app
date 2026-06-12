package com.mrtlptkn.javadesignpatternsapp.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

  public void sendNotification() {
      System.out.println("Bildirim gonderiliyor...");
  }
}
