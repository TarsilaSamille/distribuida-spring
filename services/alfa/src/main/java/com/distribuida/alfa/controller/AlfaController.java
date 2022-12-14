package com.distribuida.alfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.distribuida.alfa.services.BetaServiceInterface;

@RestController
@RequestMapping("/greek")
public class AlfaController {

    @Autowired
    BetaServiceInterface betaservice;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/alfa")
    public ResponseEntity getPort() {
        return ResponseEntity.ok("serverPort:" + serverPort);
    }

    @GetMapping("/beta")
    public ResponseEntity getData() {
        return ResponseEntity.ok(betaservice.getData());
    }

}
