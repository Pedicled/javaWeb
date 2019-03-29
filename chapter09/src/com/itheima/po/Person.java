package com.itheima.po;
//个人持久化类（一对一关系）
public class Person {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private IDCard card;
	
	public Integer getID() {
		return id;
	}
	public void setID(Integer id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public IDCard getCard() {
		return card;
	}
	public void setCard(IDCard card){
		this.card = card;
	}
	
	public String toString() {
		return "Person [id=" +id+ ",name=" +name+ "," + "age=" +age+ ",sex=" +sex+ ",card" +card+ "]";
	}
	
	
}
