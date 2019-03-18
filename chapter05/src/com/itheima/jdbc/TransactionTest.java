package com.itheima.jdbc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	public void xmlTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		accountDao.transfer("tom", "Aray", 100.0);
		System.out.println("ת�˳ɹ���");
	}
	
	@Test
	public void annotationTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");
		accountDao.transfer("tom", "Aray", 100.0);
		System.out.println("ת�˳ɹ���");
	}
}
