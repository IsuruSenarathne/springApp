package com.cordova.cordapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @RequestMapping("/")
    public String index() {
        return "Hello";
    }
}
