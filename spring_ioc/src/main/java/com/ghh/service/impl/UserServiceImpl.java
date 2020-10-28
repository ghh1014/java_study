package com.ghh.service.impl;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements IUserService {
    public void save() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = app.getBean("userDao", IUserDao.class);
        System.out.println(userDao);
        System.out.println("save方法执行了...");
    }
}
