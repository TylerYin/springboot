package com.springboot.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description Girl Repository
 * @Author Tyler Yin
 * @Create 2017-11-24 22:12
 **/
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    //根据年龄查询女生列表
    List<Girl> findByAge(Integer age);
}
