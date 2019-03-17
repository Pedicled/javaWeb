package com.itheima.jdbc;

public class Account {
	private Integer id;
	private String username;
	private Double balance;
	
	public Integer getID()
	{	return id;}
	public void setID(Integer id)
	{	this.id = id;}
	
	public String getUserName()
	{	return username;}
	public void setUserName(String username)
	{	this.username = username;}
	
	public Double getBalance()
	{	return balance;}
	public void setBalance(Double balance)
	{	this.balance = balance;}
	
	public String toString() 
	{	return "Account [id="+id+","+"username="+username+",balance="+balance+"]";}
}
