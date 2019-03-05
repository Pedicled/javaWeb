package com.itheima.instance.factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
	public static void main(String[] args)
	{
		String xmlPath = "com/itheima/instance/factory/beans3.xml";
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		Bean3 bean = applicationContext.getBean(Bean3.class);
		System.out.println(bean);
	}
}
