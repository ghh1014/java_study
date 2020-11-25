package com.ghh.dao.impl;

import com.ghh.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("dao保存方法执行了");
    }
}
