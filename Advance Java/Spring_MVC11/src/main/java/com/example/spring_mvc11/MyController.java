package com.example.spring_mvc11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping
    public String display(){
        return "Mos";
    }

//    @RequestMapping("/bhai")
//    public String display2(){
//        return "welcome to Mahesh";
//    }
}

