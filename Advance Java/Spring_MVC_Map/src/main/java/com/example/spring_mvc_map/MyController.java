package com.example.spring_mvc_map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MyController {
    @RequestMapping
    public String Display(Map<String,Object> map){
        map.put("msg","this is map object data");
        return "page1";
    }
}
