package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Jenkins CI/CD!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Jenkins Pipeline!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully";
    }
}
