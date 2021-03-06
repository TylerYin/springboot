package com.springboot.springboot.controller;

import com.springboot.springboot.bean.Girl;
import com.springboot.springboot.dao.GirlRepository;
import com.springboot.springboot.service.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description Girl controller
 * @Author Tyler Yin
 * @Create 2017-11-24 22:08
 **/
@RestController
public class GirlController {

    private static final Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        logger.debug("this is a log test, debug");
        logger.info("this is a log test, info");
        return girlRepository.findAll();
    }

    /**
     * 添加女生
     *
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        final Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * 根据id查询一个女生
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl findGirlById(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 更新一个女生
     *
     * @param id
     * @param cupSize
     * @param age
     */
    @PutMapping(value = "/girls/{id}")
    public void girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age) {
        final Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girlRepository.save(girl);
    }

    /**
     * 删除一个女生
     *
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

    /**
     * 根据年龄查询女生列表
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    /**
     * 插入两个女生
     */
    @PostMapping(value = "/girls/two")
    public void insertTwoGirl() {
        girlService.insertTwoGirl();
    }
}
