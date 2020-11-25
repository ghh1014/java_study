package com.ghh.service.impl;

import com.ghh.dao.IUserDao;
import com.ghh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    @Qualifier("userDao")
    private IUserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
