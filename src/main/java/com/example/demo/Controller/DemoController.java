package com.example.demo.Controller;

import com.example.demo.Entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭朝彤
 * @date 2017/10/31.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     *
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
