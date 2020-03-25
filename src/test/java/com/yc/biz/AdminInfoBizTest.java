package com.yc.biz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.dao.IAdminInfoMapper;
import com.yc.po.AdminInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class AdminInfoBizTest {
	@Autowired
	IAdminInfoBiz  adminInfoBiz;
	@Autowired
	IAdminInfoMapper iAdminInfoMapper;

	@Test
	public void testLogin() {
		AdminInfo af = new AdminInfo();
		af.setAname("a");
		af.setPwd("a");
		System.out.println(adminInfoBiz.login(af));
		
	}

	@Test
	public void testAdd() {
		AdminInfo af = new AdminInfo();
		af.setAname("杜兰特");
		af.setPwd("a");
		af.setTel("17889897867");
		System.out.println(adminInfoBiz.add(af));
		//iAdminInfoMapper.add(af);
	}

	@Test
	public void testFindAll() {
		List<AdminInfo> list=adminInfoBiz.findAll();
		for(AdminInfo ad:list) {
		System.out.println(ad);
		}
	}

	@Test
	public void testUpdatPwd() {
		System.out.println(adminInfoBiz.updatPwd(2));
	}

}
