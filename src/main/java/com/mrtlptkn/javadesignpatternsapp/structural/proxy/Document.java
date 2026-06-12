package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import lombok.Data;

@Data
public class Document {

    private String name;
    private String path;

    public Document(String name, String path) {
        this.name = name;
        this.path = path;
    }

}
