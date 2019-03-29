package com.itheima.po;
import java.util.List;

public class Orders {
	private Integer id;
	private String number;
	private List<Product> productList;
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "Orders [id=" +id+ ",number=" +number+ "]";
	}
}
