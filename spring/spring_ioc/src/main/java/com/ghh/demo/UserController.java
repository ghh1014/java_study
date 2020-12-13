package com.ghh.demo;

import com.ghh.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext app = new FileSystemXmlApplicationContext("E:\\java_study\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        IUserService userService = app.getBean("userService", IUserService.class);
        //app.getBean(IUserService.class);
        //IUserService userService = new UserServiceImpl();
        userService.save();
    }
}
