package com.itheima.jdk;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	public void addUser()
	{	System.out.println("����û�");}
	public void deleteUser()
	{	System.out.println("ɾ���û�");}
}
