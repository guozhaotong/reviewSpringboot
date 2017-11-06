package com.example.demo.controller;

import com.example.demo.settings.Wisely2Settings;
import com.example.demo.settings.WiselySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭朝彤
 * @date 2017/11/6.
 */
@RestController
public class ConfigurationPropertiesController {
    @Autowired
    WiselySettings wiselySettings;
    @Autowired
    Wisely2Settings wisely2Settings;

    @RequestMapping("/test")
    public String test() {
        System.out.println(wiselySettings.getGender() + "---" + wiselySettings.getName());
        System.out.println(wisely2Settings.getGender() + "===" + wisely2Settings.getGender());
        return "ok";
    }
}
