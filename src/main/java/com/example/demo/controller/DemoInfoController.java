package com.example.demo.controller;

import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 郭朝彤
 * @date 2017/11/8.
 */
@Controller
@RequestMapping("/DemoInfo")
public class DemoInfoController {
    @Autowired
    DemoInfoService demoInfoService;


    @RequestMapping("/test")
    public @ResponseBody
    String test(){
        DemoInfo loaded = demoInfoService.findById(1);
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById(1);
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById(2);
        System.out.println("loaded2="+loaded);
        return "ok";
    }


    @RequestMapping("/delete")
    public @ResponseBody String delete(long id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }

    @RequestMapping("/test1")
    public @ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }
}
