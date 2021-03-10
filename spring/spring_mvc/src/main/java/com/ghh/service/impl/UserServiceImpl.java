package com.ghh.service.impl;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public void save() {
        userDao.save();
    }
}
