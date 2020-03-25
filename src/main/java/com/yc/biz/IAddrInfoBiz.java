package com.yc.biz;

import java.util.List;

import com.yc.po.AddrInfo;


public interface IAddrInfoBiz {
	
	/**
	 * 添加地址信息
	 * @param af
	 * @return
	 */
	public int add(AddrInfo af);
	
	/**
	 * 修改默认地址
	 * @param af
	 * @return
	 */
	public int update(AddrInfo af);
	
	/**
	 * 修改默认地址
	 * @param af
	 * @return
	 */
	public int updates(String[] anos);

	/**
	 * 查询指定会员的地址信息
	 * @param mno
	 * @return
	 */
	public List<AddrInfo> findByMno(Integer mno);
}
