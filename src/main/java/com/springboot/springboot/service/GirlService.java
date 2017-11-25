package com.springboot.springboot.service;

import com.springboot.springboot.bean.Girl;
import com.springboot.springboot.dao.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Description Girl Service
 * @Author Tyler Yin
 * @Create 2017-11-24 23:09
 **/
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwoGirl() {
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(17);
        girlB.setCupSize("BBBBB");
        girlRepository.save(girlB);
    }
}
