package com.xyp.javalearn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/xyp")
public class HealthCheck {

    @GetMapping(value = "/health")
    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.ok("this is OK!");
    }
}
