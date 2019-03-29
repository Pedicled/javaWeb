package com.itheima.po;
import java.util.List;

//商品持久化类
public class Product {
	private Integer id;
	private String name;
	private Float price;
	private List<Orders> orders;
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price=price;
	}
	public List<Orders> getOrders(){
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public String toString() {
		return "Product [id=" +id+ ",name=" +name+ ",price=" +price+ "]";
	}
}
