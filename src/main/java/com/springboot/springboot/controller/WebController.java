package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyler
 */
@Controller
@RequestMapping(value = "/web")
public class WebController {

	/**
	 * 1.Spring Boot强烈不建议使用JSP做为前台页面渲染的模块，
	 * 	如果要使用的话，可以参照此次的提交进行配置；配置完成之后只能使用maven命令：mvn spring-boot:run来运行程序。
	 * 2.关系静态资源在页面中的引用问题：
	 *  由于Spring Boot本身已经对项目目录结构做了严格的规定并在系统启动的时候，会对静态资源如js, image等会进行重新映射，
	 *  因此，在JSP中引用的时候，是不需要再加入resource中下一级的前缀包名的，如index.jsp中引用的图片和样式文件。
	 * 3.由于pom.xml中引用的jar包在下载的时候非常慢，强烈建议在maven的配置文件settings.xml中配置一个阿里云的镜像地址，
	 *  这样会极大地加快相关jar文件的下载速度。
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "index")
	public String index(ModelMap map) {
		map.put("title", "thymeleaf hello word");
		return "index";
	}

}
