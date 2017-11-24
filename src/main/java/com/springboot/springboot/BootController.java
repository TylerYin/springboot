package com.springboot.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description Hello Spring Boot
 * @Author Tyler Yin
 * @Create 2017-11-23 21:21
 **/

/**
 * 若不用RestController注解，那么返回的字符串必须要对应一个模块，
 * 如JSP或者如在pom文件中定义的使用thymeleaf模块
 */
@Controller
public class BootController {
    @RequestMapping(value = "/boot", method = RequestMethod.GET)
    public String say(Model model, HttpServletRequest request) {
        return "index";
    }
}
