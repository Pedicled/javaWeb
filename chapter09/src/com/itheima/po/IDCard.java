package com.itheima.po;
//证件持久化类（一对一关系）
public class IDCard {
	private Integer id;
	private String code;
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String toString() {
		return "IDCard [id=" +id+ ",code=" +code+ "]";
	}
}
