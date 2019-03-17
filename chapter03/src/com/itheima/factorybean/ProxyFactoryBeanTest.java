package com.itheima.factorybean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.itheima.jdk.UserDao;
public class ProxyFactoryBeanTest {
	public static void main(String[] agrs){
		String xmlPath = "com/itheima/factorybean/applicationContext.xml";
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		userDao.addUser();
		userDao.deleteUser();
	}
}