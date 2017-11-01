package com.example.demo.Controller;

import com.example.demo.Entity.Demo;
import com.example.demo.Service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
    @Resource
    private DemoService demoService;

    @RequestMapping("/save")
    public String save(){
        Demo d = new Demo();
        d.setName("Angel");
        demoService.save(d);//保存数据.
        return"ok.Demo2Controller.save";
    }

    @RequestMapping("/getById")
    public Demo getById(long id){
        return demoService.getById(id);
    }
}
