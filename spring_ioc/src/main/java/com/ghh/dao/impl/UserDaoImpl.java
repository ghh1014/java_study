package com.ghh.dao.impl;

import com.ghh.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    public void save() {
        System.out.println("save running....");
    }

    public void init() {
        System.out.println("UserDaoImpl创建了...");
    }

    public void release() {
        System.out.println("UserDaoImpl被销毁了...");
    }
}
