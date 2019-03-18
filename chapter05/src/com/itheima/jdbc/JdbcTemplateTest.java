package com.itheima.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		jdbcTemplate.execute("CREATE TABLE account("
							+"id INT PRIMARY KEY IDENTITY(1,1),"
							+"username VARCHAR(50),"
							+"balance DOUBLE PRECISION)");
		System.out.println("账户表account创建成功");
	}
	
	public void addAccountTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = 
				(AccountDao) applicationContext.getBean("accountDao");
		Account account = new Account();
		account.setUserName("Aray");
		account.setBalance(2000.00);
		int num = accountDao.addAccount(account);
		if(num>0)
			System.out.println("成功插入了"+num+"条数据！");
		else 
			System.out.println("插入操作执行失败！");
	}
	
	public void updateAccountTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = 
				(AccountDao) applicationContext.getBean("accountDao");
		Account account = new Account();
		account.setID(2);
		account.setUserName("tom");
		account.setBalance(2000.00);
		int num = accountDao.updateAccount(account);
		if(num>0)
			System.out.println("成功修改了"+num+"条数据！");
		else 
			System.out.println("修改操作执行失败！");
	}

	public void deleteAccountTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = 
				(AccountDao) applicationContext.getBean("accountDao");
		int num = accountDao.deleteAccount(4);
		if(num>0)
			System.out.println("成功删除了"+num+"条数据！");
		else 
			System.out.println("删除操作执行失败！");
	}
	
	public void findAccountByIDTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = 
				(AccountDao) applicationContext.getBean("accountDao");
		Account account = accountDao.findAccountByID(5);
		System.out.println(account);
	}
	@Test
	public void findAllAccountTest() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = 
				(AccountDao) applicationContext.getBean("accountDao");
		List<Account> account = accountDao.findAllAccount();
		for(Account act:account) {
			System.out.println(act);
		}
	}
}
