package com.example.firstjenkins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("secondpage")
    String getSecondPage(){
        return "secondpage";
    }

    public int sum(int a, int b){
        return a+b;
    }
}
