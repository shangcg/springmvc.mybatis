package com.shangcg.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shangcg.pojo.User;
import com.shangcg.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	
	@Resource
	private IUserService userService = null;

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println("id:" + user.getId());
		System.out.println("userName:" + user.getUserName());
		System.out.println("passWord:" + user.getPassword());
	}
}
