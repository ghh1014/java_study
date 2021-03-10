package com.ghh.dao.impl;

import com.ghh.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    public void save() {
        System.out.println("save running....");
    }
}
