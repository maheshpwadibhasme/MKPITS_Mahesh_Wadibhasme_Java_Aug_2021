package com.example.spring_mvc_form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @RequestMapping("/home")
    public String DisplayForm(){
        return "Form1";
    }
    @RequestMapping("/Success")
    public String CollectData(@RequestParam("uname")String name, @RequestParam("upass") String pass, Model mod ){
        mod.addAttribute("name1",name);
        mod.addAttribute("pass1",pass);
        return "Form2";
    }
}
