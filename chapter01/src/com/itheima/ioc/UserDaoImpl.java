package com.itheima.ioc;

public class UserDaoImpl implements UserDao{

	@Override	//��ע��˵��say�������Ǹ���(�ӿ�)����
	public void say() {
		System.out.println("userDao say hello world!");
	}

}
