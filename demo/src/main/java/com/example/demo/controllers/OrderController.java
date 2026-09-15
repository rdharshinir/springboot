package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class OrderController {

    @GetMapping("/order")
    public String order(@RequestParam String item){
        return "Your order" + item +"has been delivered";
    }
}
