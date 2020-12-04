package com.ghh.service.impl;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
//@Scope("prototype")
public class UserServiceImpl implements IUserService {

    @Value("${jdbc.driver}")
    private String driver;

    //@Autowired
    //@Qualifier("userDao") //Qualifier可指定Id,但是它需要和Autowired一起出现
    @Resource(name = "userDao")
    private IUserDao userDao;

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
}
