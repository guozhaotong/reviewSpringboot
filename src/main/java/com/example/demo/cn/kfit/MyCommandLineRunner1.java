package com.example.demo.cn.kfit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郭朝彤
 * @date 2017/11/7.
 */
@Configuration
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner1.run()");
    }
}
