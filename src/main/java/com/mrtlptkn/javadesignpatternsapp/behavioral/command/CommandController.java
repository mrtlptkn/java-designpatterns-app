package com.mrtlptkn.javadesignpatternsapp.behavioral.command;

import com.mrtlptkn.javadesignpatternsapp.behavioral.command.application.RemoteControlRequest;
import com.mrtlptkn.javadesignpatternsapp.behavioral.command.application.RemoteControllerApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/command")
public class CommandController {

    private final RemoteControllerApplication commandApplication;


    public CommandController(RemoteControllerApplication commandApplication) {
        this.commandApplication = commandApplication;
    }

    @PostMapping("open")
    public ResponseEntity<String> open(@RequestBody RemoteControlRequest request){
        commandApplication.open(request);
        return ResponseEntity.ok("Command Design Pattern");
    }

    @PostMapping("close")
    public ResponseEntity<String> close(@RequestBody RemoteControlRequest request){
        commandApplication.close(request);
        return ResponseEntity.ok("Command Design Pattern");
    }



}
