package com.ghh.demo;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import com.ghh.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext app = new FileSystemXmlApplicationContext("E:\\java_study\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        IUserService userService = app.getBean("userService", IUserService.class);
        //IUserService userService = new UserServiceImpl();
        userService.save();
    }
}
