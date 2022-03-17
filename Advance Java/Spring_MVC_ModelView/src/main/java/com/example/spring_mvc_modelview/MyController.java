package com.example.spring_mvc_modelview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping
    public ModelAndView Display(){
        ModelAndView mod = new ModelAndView("page1");
        mod.addObject("msg","this is model and view object data");
        return mod;
    }
}
