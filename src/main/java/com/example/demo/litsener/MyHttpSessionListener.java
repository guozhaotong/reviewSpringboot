package com.example.demo.litsener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author 郭朝彤
 * @date 2017/11/6.
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session 被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("ServletContex初始化");
    }
}
