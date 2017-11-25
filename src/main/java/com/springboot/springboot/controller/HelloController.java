package com.springboot.springboot.controller;

import com.springboot.springboot.properties.BoyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description Spring Boot Demo
 * @Author Tyler Yin
 * @Create 2017-11-22 21:34
 **/
//RestController相当于同时使用了Controller和ResponseBody两个注解
@RestController
@RequestMapping(value="hello")
public class HelloController {
    @Value("${age}")
    private int age;

    @Value("${cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private BoyProperties boyProperties;

    @RequestMapping(value = {"/say", "/hi"}, method = RequestMethod.GET)
    public String demo() {
        return "Hello Spring Boot <p>" + "The girl " + content + "<p> The boy hobby is "
                + boyProperties.getHobby();
    }

    @RequestMapping(value="path/{id}")
    public String pathVariableTest(@PathVariable("id") Integer id){
        return "id: " + id;
    }

    /**
     * 1.采用requestParam这种方式，可以获取Get和Post请求中传递过来的数据
     * 2.为了简化注解，可以使用GetMapping代替下面注释的注解，两者是等价的
     * 类似的还有PutMapping等等
     * @param myId
     * @return
     */
    @GetMapping(value="/param")
    //@RequestMapping(value="/param", method = RequestMethod.GET)
    public String requestParamTest(@RequestParam(value = "id", required = false, defaultValue = "100") Integer myId) {
        return "id: " + myId;
    }
}
