package com.mrtlptkn.javadesignpatternsapp.structural.proxy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proxy")
public class ProxyController {

    private final DocumentsRequestApplication application;

    public ProxyController(DocumentsRequestApplication application) {
        this.application = application;
    }


    @PostMapping("docs")
    public ResponseEntity<String> test(@RequestBody DocumentRequest request) {

        this.application.handle(request);

        return ResponseEntity.ok("Proxy pattern test endpoint");
    }


}
