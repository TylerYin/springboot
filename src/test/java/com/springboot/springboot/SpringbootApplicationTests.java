package com.springboot.springboot;

import com.springboot.springboot.bean.RoncooUser;
import com.springboot.springboot.mapper.RoncooUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private RoncooUserMapper mapper;

	@Test
	public void contextLoads() {

	}

	@Test
	public void insert() {
		RoncooUser roncooUser = new RoncooUser();
		roncooUser.setName("测试");
		roncooUser.setCreateTime(new Date());
		int result = mapper.insert(roncooUser);
		System.out.println(result);
	}

	@Test
	public void select(){
		RoncooUser roncooUser = mapper.selectByPrimaryKey(2);
		System.out.println(roncooUser);
	}

}
