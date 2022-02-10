package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${build.mode}")
    private String buildMode;
    
    @GetMapping("/")
    public String index() {
        return "Hello from " + buildMode;
    }
}
