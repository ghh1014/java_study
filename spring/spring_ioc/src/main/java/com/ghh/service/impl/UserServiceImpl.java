package com.ghh.service.impl;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }

    /*
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl() {
    }

    public void save() {
        userDao.save();
        System.out.println("save方法执行了...");
    }
}
