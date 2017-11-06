package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 郭朝彤
 * @date 2017/11/6.
 */
@Component
@Order(value=1)
public class MyStartupRunner2 implements CommandLineRunner {
    @Override
    public void run(String...args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 22222222<<<<<<<<<<<<<");
    }


}
