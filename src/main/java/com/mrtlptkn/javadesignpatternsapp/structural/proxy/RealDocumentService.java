package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class RealDocumentService implements DocumentService {
    @Override
    public List<Document> getDocuments(String bucketName) {

        // Get Document by Bucket -> Büyük bir size
        // Document Db çeker
        // İkisini mapler


        return List.of(new Document("a.txt","~docs/hr"),
                new Document("b.df","~docs/finance"));
    }
}
