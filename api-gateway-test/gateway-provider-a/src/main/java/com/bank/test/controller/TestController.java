package com.bank.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String helloApiGateway() {
        return "Hello Api-Gateway! Here is Provider-A!";
    }
}
