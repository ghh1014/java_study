package com.ghh.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ghh.domain.User;
import com.ghh.domain.VO;
import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick10")
    @ResponseBody
    public void save10(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    public void save9(VO vo) {
        System.out.println(vo);
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public void save8(String[] strs){
        System.out.println(Arrays.asList(strs));
        System.out.println(Arrays.toString(strs));
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public void save7(User user){
        System.out.println(user);
    }

    @RequestMapping("/quick6")
    @ResponseBody
    public User save6(){
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
