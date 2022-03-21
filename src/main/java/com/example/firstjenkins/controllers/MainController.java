package com.example.firstjenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("info")
    String getSecondPage(){
        return "info";
    }

    @RequestMapping("index")
    String getIndex(){
        return "index";
    }

    public int sum(int a, int b){
        return a+b;
    }
}
