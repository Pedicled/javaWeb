package com.itheima.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("all")
public class AnnotationAssembleTest {
	public static void main(String[] args)
	{
		String xmlPath = "com/itheima/annotation/beans6.xml";
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		UserController userController = 
				applicationContext.getBean(UserController.class);
		userController.save();
	}
}
