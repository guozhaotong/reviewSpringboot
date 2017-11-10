package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 郭朝彤
 * @date 2017/11/10.
 */
@Controller
@RequestMapping("/logtest")
public class LogTestController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    @ResponseBody
    String test(HttpServletRequest req) {
        logger.warn("测试日志");
        return "Hello World!";
    }
}
