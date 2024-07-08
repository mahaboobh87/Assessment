package com.example.apikey_auth_provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apikey")
public class ApiKeyAuthController {

    @GetMapping("/validate")
    public String validateApiKey() {
        // Logic to validate API key and return a token
        return "valid-api-key-token";
    }
}