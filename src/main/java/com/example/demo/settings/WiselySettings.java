package com.example.demo.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 郭朝彤
 * @date 2017/11/6.
 */
@Configuration
@PropertySource("classpath:wisely.properties")
@ConfigurationProperties(prefix = "wisely")
public class WiselySettings {
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
