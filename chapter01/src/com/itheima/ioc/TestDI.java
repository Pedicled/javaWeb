package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args)
	{
		//��ʼ��Spring���������������ļ�
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��������ȡUserServiceʵ��
		UserService userService = (UserService) applicationContext.getBean("userService");
		//����ʵ���е�say()����
		userService.say();
	}
}
