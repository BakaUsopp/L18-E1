package com.example.l18e1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }


    @PostMapping("/smth")
    public String dosmth(){
        System.out.println("do something worked");
        return "index";
    }


}
