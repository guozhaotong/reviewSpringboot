package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author 郭朝彤
 * @date 2017/11/7.
 */
@Service
public class HelloService {
    public String getName(){
        return "hello";
    }
    public HelloService(){
        System.out.println("HelloService.HelloService()");
        System.out.println("org.kfit.service.HelloService.HelloService()");
        System.out.println("HelloService.HelloService()");
    }
}
