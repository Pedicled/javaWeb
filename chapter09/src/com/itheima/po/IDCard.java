package com.itheima.po;
//֤���־û��ࣨһ��һ��ϵ��
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
