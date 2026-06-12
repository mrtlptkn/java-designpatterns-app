package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import java.util.List;

public interface DocumentService {
   List<Document> getDocuments(String bucketName);
}
