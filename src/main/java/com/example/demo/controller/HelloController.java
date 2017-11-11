package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author 郭朝彤
 * @date 2017/11/10.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
