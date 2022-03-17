package com.example.spring_mvc_modelmap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping
    public String Display(ModelMap mod){
        mod.addAttribute("msg","This is Model Map object data");
        return "page1";
    }
}
