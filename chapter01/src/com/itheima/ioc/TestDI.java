package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args)
	{
		//初始化Spring容器，加载配置文件
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取UserService实例
		UserService userService = (UserService) applicationContext.getBean("userService");
		//调用实例中的say()方法
		userService.say();
	}
}
