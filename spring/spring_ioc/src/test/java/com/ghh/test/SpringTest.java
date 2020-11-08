package com.ghh.test;

import com.ghh.dao.IUserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao1 = app.getBean("userDao", IUserDao.class);
        IUserDao userDao2 = app.getBean("userDao", IUserDao.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        app.close();
        //Map<String, String> map = new HashMap<String, String>();
        //map.size()
    }
}
