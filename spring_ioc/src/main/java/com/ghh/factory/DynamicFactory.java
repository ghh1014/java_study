package com.ghh.factory;

import com.ghh.dao.IUserDao;
import com.ghh.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public IUserDao getUserDao(){
        return new UserDaoImpl();
    }
}
