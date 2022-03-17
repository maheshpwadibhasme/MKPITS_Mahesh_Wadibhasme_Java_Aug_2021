package com.example.spring_mvc_model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping
    public String Display(Model mod){
        mod.addAttribute("msg","This is model object data");
        return "page1";
    }
}
