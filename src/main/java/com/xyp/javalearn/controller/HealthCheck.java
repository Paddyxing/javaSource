package com.xyp.javalearn.controller;

import com.xyp.javalearn.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/xyp")
public class HealthCheck {

    @GetMapping(value = "/health")
    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.ok("this is OK!");
    }

    @GetMapping(value = "/student")
    public ResponseEntity<Object> getStudent(@Valid @RequestBody Student student) {
        System.out.println(student);
        return ResponseEntity.ok("this is OK!");
    }

}
