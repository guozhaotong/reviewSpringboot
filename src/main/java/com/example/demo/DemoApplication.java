package com.example.demo;

import com.example.demo.config.ConfigClass;
import com.example.demo.repository.DemoDao;
import com.example.demo.service.HelloService2;
import com.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.servlet.MultipartConfigElement;


@ServletComponentScan
@SpringBootApplication
//@ComponentScan(basePackages={"com.example.demo.cn.kfit","com.example.demo.org.kfit"})
//@ComponentScan(basePackageClasses ={HelloService2.class, DemoDao.class}) //ConfigClass.class,
@EnableAsync
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... args) {
        System.out.println(this.helloWorldService.getHelloMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        SpringApplication.run(DemoApplication.class, new String[]{"hello,","林峰"});

    }

//    /**
//     * 设置上传文件的大小限制
//     * @return
//     */
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
//        factory.setMaxFileSize("128KB"); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("256KB");
//        //Sets the directory location wherefiles will be stored.
//        //factory.setLocation("路径地址");
//        return factory.createMultipartConfig();
//    }
}


