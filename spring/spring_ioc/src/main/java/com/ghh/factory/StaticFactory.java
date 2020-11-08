package com.ghh.factory;

import com.ghh.dao.IUserDao;
import com.ghh.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static IUserDao getUserDao(){
        return new UserDaoImpl();
    }
}
