package com.ghh.demo;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import com.ghh.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = app.getBean("userService", IUserService.class);
        //IUserService userService = new UserServiceImpl();
        userService.save();
    }
}
