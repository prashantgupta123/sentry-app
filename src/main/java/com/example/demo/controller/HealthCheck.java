package com.example.demo.controller;

import io.sentry.Sentry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/test")
    public String home() {
        return "This is the get request";
    }

    @GetMapping("/test1")
    public String test1() {
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "Exception Occur";
    }

}
