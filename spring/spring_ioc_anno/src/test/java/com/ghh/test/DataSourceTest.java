package com.ghh.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import java.util.ResourceBundle;

public class DataSourceTest {

    /**
     * 测试手动创建数据源(加载properties配置文件)
     */
    @Test
    public void test3() throws Exception{
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        //创建数据源
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(rb.getString("jdbc.driver"));
        dataSource.setUrl(rb.getString("jdbc.url"));
        dataSource.setUsername(rb.getString("jdbc.username"));
        dataSource.setPassword(rb.getString("jdbc.password"));
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    /**
     * 测试手动创建数据源
     */
    @Test
    public void test1() throws Exception{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/asdf");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
