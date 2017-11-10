package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭朝彤
 * @date 2017/11/10.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name,int state){
        return"name"+name+"---"+state;
    }
}
