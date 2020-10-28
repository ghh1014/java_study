package com.ghh.demo;

import com.ghh.dao.IUserDao;
import com.ghh.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = app.getBean("userDao",IUserDao.class);
        userDao.save();
    }
}
