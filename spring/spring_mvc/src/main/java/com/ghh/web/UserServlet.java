package com.ghh.web;

import com.ghh.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        IUserService userService = app.getBean(IUserService.class);
        userService.save();
        System.out.println("中文乱码");
    }
}
