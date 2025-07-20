package com.jasypt.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @Value("${secret.property.example.value}")
    private String secretParam;

    @GetMapping("/test")
    private String test() {
        return secretParam;
    }

}
