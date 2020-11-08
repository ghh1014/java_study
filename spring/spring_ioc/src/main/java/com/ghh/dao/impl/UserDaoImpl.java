package com.ghh.dao.impl;

import com.ghh.dao.IUserDao;
import com.ghh.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements IUserDao {

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    private String userName;
    private Integer age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running....");
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /*public void init() {
        System.out.println("UserDaoImpl创建了...");
    }

    public void release() {
        System.out.println("UserDaoImpl被销毁了...");
    }*/
}
