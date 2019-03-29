package com.itheima.po;

import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String address;
	private List<Orders> orderList;
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Orders> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}
	
	public String toString() {
		return "User [id=" +id+ ",username=" +username+ ",address=" +address+ ",orderList=" +orderList+ "]";
	}
}
