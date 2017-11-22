package com.springboot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Spring Boot Demo
 * @Author Tyler Yin
 * @Create 2017-11-22 21:34
 **/
@RestController
public class HelloController {
    @Value("${age}")
    private int age;

    @Value("${cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private BoyProperties boyProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String demo() {
        return "Hello Spring Boot <p>" + "The girl " + content + "<p> The boy hobby is "
                + boyProperties.getHobby();
    }
}
