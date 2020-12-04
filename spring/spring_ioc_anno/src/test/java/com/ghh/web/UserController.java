package com.ghh.web;

import com.ghh.config.SpringConfiguration;
import com.ghh.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IUserService userService = app.getBean(IUserService.class);
        userService.save();
    }
}
