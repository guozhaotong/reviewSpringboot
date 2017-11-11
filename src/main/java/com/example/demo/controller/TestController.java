package com.example.demo.controller;

import com.example.demo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭朝彤
 * @date 2017/11/11.
 */
@RestController
public class TestController {
    @Autowired
    private Task task;
    @RequestMapping("/task1")
    public String task1()throws Exception{
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
        return"task";
    }
}
