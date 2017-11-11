package com.example.demo.controller;

import com.example.demo.properties.CompanyProperties;
import com.example.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.Max;

/**
 * @author 郭朝彤
 * @date 2017/11/11.
 */
@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @Autowired
    private CompanyProperties companyProperties;

    private String to = "tongtong40310@163.com";
    //    private String to="xjtushilei@foxmail.com";

//    @Value("${com.example.demo.desc}")
//    private String content;

//    @Max(value = 99)
//    private int count = companyProperties.getUrl().length();

    @RequestMapping("/mail")
    public String mail() {
        return "/mail";
    }

    @RequestMapping("/sendMail")
    @ResponseBody
    public String sendMail(@RequestParam("title") String title) {
        System.out.println("test");
//        mailService.sendSimple(to, title, content);
        return "success";
    }
}
