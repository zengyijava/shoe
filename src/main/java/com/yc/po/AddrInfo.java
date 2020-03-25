package com.yc.po;

import java.io.Serializable;

/**
 * 收货地址
 * 
 */
public class AddrInfo implements Serializable{
	private static final long serialVersionUID = -6766225658197898182L;
	private String ano;
	private int mno;
	private String name;  // 收货人姓名
	private String tel;  // 收货人联系方式
	private String province;  // 省
	private String city;  // 市
	private String area;  // 区
	private String addr;
	private String flag;  // 是否为默认收货地址
	private String status;  // 状态
	private String temp;

	private String Email;
	private String photo;
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
