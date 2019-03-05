package com.itheima.ioc;

public class UserDaoImpl implements UserDao{

	@Override	//该注解说明say方法覆盖父类(接口)方法
	public void say() {
		System.out.println("userDao say hello world!");
	}

}
