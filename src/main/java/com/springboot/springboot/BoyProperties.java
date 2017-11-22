package com.springboot.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description Girl entity properties
 * @Author Tyler Yin
 * @Create 2017-11-22 22:15
 **/
@Component
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private String sex;
    private String hobby;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
