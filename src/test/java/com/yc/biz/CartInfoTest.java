package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.CartInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class CartInfoTest {
	
	@Autowired
	ICartInfoBiz biz;

	@Test
	public void testFindByMno() {
		System.out.println(biz.findByMno(1));
	}
	
	@Test
	public void testUpdate() {
		CartInfo cf=new CartInfo();
		cf.setCno(11);
		cf.setNum(1);
		System.out.println(biz.update(cf));
		
	}

}
