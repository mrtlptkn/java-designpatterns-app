package com.mrtlptkn.javadesignpatternsapp.creational.singleton;


// Not: Java Runtime.getRunTime(); farmework örneği

public class DatabaseConnection {

    // bu nesneyi kilitleyeceğiz. CPU cacheleme ve intruction reordering sorunlarını önler.
    // thread safe çalışmamızı sağlar
    // Kilitleyeceğimiz nesnenin DatabaseConnection.class bu özellikte olması gerekiyor.
    private volatile static DatabaseConnection instance;

    private final String url;
    private final int maxPoolSize;

    public void connect(){
        System.out.println("Connecting to database at " + url + " with max pool size " + maxPoolSize);
    }

    private DatabaseConnection(String url, int maxPoolSize) {
        // private constructor
        this.url = url;
        this.maxPoolSize = maxPoolSize;
    }

    // Manuel bir yöntem kendimiz kilit mekanizması ile yönetim yapıyoruz
    public  static DatabaseConnection getInstance(String url, int maxPoolSize) {
        if (instance == null) { // ilk kontrol (lock öncesi)
            synchronized (DatabaseConnection.class) { // sınıf seviyesinde kilitleme
                if (instance == null) { // ikinci kontrol (lock sonrası)
                    instance = new DatabaseConnection(url, maxPoolSize);
                }
            }
        }

        return instance;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public String getUrl() {
        return url;
    }
}
