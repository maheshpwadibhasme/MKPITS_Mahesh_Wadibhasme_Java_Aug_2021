package com.example.spring_mvc_form2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @RequestMapping("/home")
    public String Display(){
        return "Form1";
    }

    @RequestMapping("/Success")
//    public String CollectDat(@RequestParam("uname")String name, @RequestParam("upass")String pass ,Model mod){
//
//        Login ob=new Login();
//        ob.setUname(name);
//        ob.setUpass(pass);
//
//        mod.addAttribute("lob",ob);
//        return "Form2";
//    }
    public String CollectDat(@ModelAttribute("lob")Login ob){

        return "Form2";
    }
}
