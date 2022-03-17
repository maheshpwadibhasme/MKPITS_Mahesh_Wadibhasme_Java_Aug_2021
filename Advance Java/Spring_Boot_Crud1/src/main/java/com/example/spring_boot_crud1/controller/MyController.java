package com.example.spring_boot_crud1.controller;

import com.example.spring_boot_crud1.model.Login;
import com.example.spring_boot_crud1.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    private LoginRepo repo;

    @RequestMapping("/home")
    public String Display(){
        return "Form1";
    }

    @RequestMapping("/Success")
    public String CollectDat(@ModelAttribute("lob") Login ob){

        repo.save(ob);

        return "Form2";
    }
}
