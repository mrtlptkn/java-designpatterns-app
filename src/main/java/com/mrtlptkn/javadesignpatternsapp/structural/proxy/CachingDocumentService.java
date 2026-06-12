package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Proxy Service
@Component
public class CachingDocumentService implements DocumentService {

    // kodda herhangi bir imza değişimi yapamadan sadece ilgili sınıfı CachingDocumentService proxy servisi ile sarmalıyarak ekstra bir kontrol özelliği kazandırmış oldu. Caching

    private final RealDocumentService realDocumentService;
    // simüle etmek için static yaptık, uygun bir kullanım değil.
    // thread safe singleton pattern ile yapmak lazım.
    private static final List<Document> documents = new ArrayList<>();

    public CachingDocumentService(RealDocumentService realDocumentService) {
        this.realDocumentService = realDocumentService;
    }

    @Override
    public List<Document> getDocuments(String bucketName) {

        System.out.println("CachingDocumentService: Belgeler cache'de aranıyor...");

        if (documents.isEmpty()) {
            System.out.println("Cache boş, gerçek servisten belgeler alınıyor...");
            documents.addAll(realDocumentService.getDocuments(bucketName));
        } else {
            System.out.println("Cache'den belgeler alınıyor...");
        }

        return documents;
    }
}
