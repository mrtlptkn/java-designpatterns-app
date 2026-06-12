package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import org.springframework.stereotype.Component;

import javax.sql.rowset.spi.SyncResolver;
import java.util.List;

@Component
public class DocumentsRequestApplication {

    private final RealDocumentService documentService;
    // ektradan proxy sınıfınıda buraya ekliyoruz

    public DocumentsRequestApplication(RealDocumentService documentService) {
        this.documentService = documentService;
    }

    public void handle(DocumentRequest request) {
       System.out.println("Belge talebi alindi: " + request.bucketName());
        // List<Document> docs = documentService.getDocuments(request.bucketName());

        // real service proxy servisine gönderilerek ara işleme tabi tutuluyor.
        // CachingDocumentService Proxy Sınıfı
        CachingDocumentService cachingDocumentService = new CachingDocumentService(documentService);
        List<Document> docs = cachingDocumentService.getDocuments(request.bucketName());

        System.out.println("Belge talebi tamamlandi: " + request.bucketName() + ", Belgeler: " + docs);
    }


}
