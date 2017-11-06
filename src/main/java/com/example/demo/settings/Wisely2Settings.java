package com.example.demo.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郭朝彤
 * @date 2017/11/6.
 */
@Configuration
@ConfigurationProperties(prefix = "tongtong")
public class Wisely2Settings {

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
