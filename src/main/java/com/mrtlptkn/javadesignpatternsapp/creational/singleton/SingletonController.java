package com.mrtlptkn.javadesignpatternsapp.creational.singleton;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/singleton")
public class SingletonController {

    @PostMapping("test")
    public ResponseEntity<String> test(){

        ConfigManager configManager = ConfigManager.getInstance();

        return ResponseEntity.ok("Singleton örneği: " + configManager.getAppName() + " v" + configManager.getVersion());
    }

}
