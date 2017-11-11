package com.example.demo.properties;

import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/11.
 */
@ConfigurationProperties(prefix ="tongtong.company")
@Component
public class CompanyProperties {
    @URL
    private String url;

    public CompanyProperties(String url) {
        this.url = url;
    }

    public CompanyProperties() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CompanyProperties{" +
                "url='" + url + '\'' +
                '}';
    }
}
