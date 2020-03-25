package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.AddrInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class AddrInfoTest {

	@Autowired
	IAddrInfoBiz biz;
	
	@Test
	public void testfindByMno() {
		System.out.println(biz.findByMno(1));
	}
	
	@Test
	public void testUdpate() {
		AddrInfo af=new AddrInfo();
		af.setMno(2);
		af.setAddr("广东省广州市越秀区小蛮腰");
		af.setName("b");
		af.setTel("15823585518");
		af.setPhoto("123456");
		System.out.println(biz.update(af));
	}

}


 
