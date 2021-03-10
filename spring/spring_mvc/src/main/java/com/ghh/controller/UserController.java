package com.ghh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save(){
        System.out.println("User Controller save running.....");
        return "success.jsp";
    }
}
