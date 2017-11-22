package com.springboot.springboot;

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

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String demo(){
        return "Hello Spring Boot";
    }
}
