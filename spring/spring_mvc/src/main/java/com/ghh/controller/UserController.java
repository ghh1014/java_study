package com.ghh.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ghh.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick6")
    @ResponseBody
    public User save6() throws Exception {
        User user = new User("ghh",30);
        return user;
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public String save5() throws Exception {
        User user = new User("ghh",30);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(user);
        return jsonStr;
    }

    @RequestMapping("/quick4")
    @ResponseBody
    public String save4(){
        return "lalala1234";
    }

    @RequestMapping("/quick3")
    public void save3(HttpServletResponse httpResponse) throws IOException {
        httpResponse.getWriter().println("lalala");
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("userName","hehehe");
        return modelAndView;
    }

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("User Controller save running.....");
        return "success";
    }
}
