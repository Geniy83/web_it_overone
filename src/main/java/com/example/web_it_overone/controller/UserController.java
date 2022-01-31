package com.example.web_it_overone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/login")
    public String login(Map<String, Object> model) {
        return "login";
    }

    @GetMapping("/currency")
    public String currency(Map<String, Object> model) {
        return "currency";
    }
}
