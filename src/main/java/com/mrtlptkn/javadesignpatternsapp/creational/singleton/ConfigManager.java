package com.mrtlptkn.javadesignpatternsapp.creational.singleton;

// Uygulama içerisindeki konfigürasyonları yönettiğim bir sınıf olsun
public class ConfigManager {

    private  final  String appName;
    private final String version;
    private final String environment;


    // dışarıdan newlemeyi kapatmak için private constructor kullandık
    private ConfigManager(){
        this.appName = "creational-patterns";
        this.version = "1.0.0";
        this.environment = System.getProperty("spring.profiles.active", "default");
    }

    // Not: Holder yönteminde instance alırken parametreik bir yapı kuramayız.
    // new ConfigManager(); üzerinden izin veriyor.
    // thread-safe bir yapı sağlıyor.
    // Java JVM üzerinden sağlanan bir özellik.
    // eş zamanlılık concurency sorunlarını ortadan kaldırıyor.
    private static class Holder{
        // uygulama genelinde single bir instance sağlar
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    // instance erişimi sağlar
    public  static ConfigManager getInstance(){
        return Holder.INSTANCE;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }
}

