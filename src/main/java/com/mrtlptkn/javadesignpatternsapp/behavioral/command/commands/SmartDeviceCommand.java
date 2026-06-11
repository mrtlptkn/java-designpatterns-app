package com.mrtlptkn.javadesignpatternsapp.behavioral.command.commands;

// Genel bir interface yaparbilir. Özel bir parametrik değer göndermeyecek ise her command
// sınıfı bunu kullanabilir
public interface SmartDeviceCommand {

    void execute(); // komutu çalıştırır

}
