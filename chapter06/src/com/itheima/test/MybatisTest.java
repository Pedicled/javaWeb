package com.itheima.test;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.itheima.po.Customer;
import com.itheima.po.User;

public class MybatisTest {
	
	
	//根据客户编号查询客户信息
	public void findCustomerByIdTest() throws Exception{
		//读取配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream = 
				Resources.getResourceAsStream(resource);
		//根据配置文件构建SqlSession
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		//通过SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//SqlSession执行映射文件中定义的SQL，并返回映射结果
		Customer customer = sqlSession.selectOne("com.itheima.mapper"+".CustomerMapper.findCustomerById",1);
		System.out.println(customer.toString());
		sqlSession.close();
	}
	
	
	//根据用户名称来模糊查询用户信息列表
	public void findCustomerByNameTest() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Customer> customers = sqlSession.selectList("com.itheima.mapper"+".CustomerMapper.findCustomerByName","j");
		for(Customer customer:customers) {
			System.out.println(customer);
		}
		sqlSession.close();
	}
	
	
	//添加客户
	public void addCustomerTest() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Customer customer = new Customer();
		customer.setUsername("rose");
		customer.setJobs("student");
		customer.setPhone("13840233920");
		//返回SQL语句影响的行数
		int rows = sqlSession.insert("com.itheima.mapper"+".CustomerMapper.addCustomer",customer);
		if(rows>0)
			System.out.println("您成功插入了"+rows+"条数据");
		else
			System.out.println("执行插入操作失败！");
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	//更新客户
	public void updateCustomerTest() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Customer customer = new Customer();
		customer.setID(4);
		customer.setUsername("rose");
		customer.setJobs("programmer");
		customer.setPhone("13111111111");
		
		int rows = sqlSession.update("com.itheima.mapper"+".CustomerMapper.updateCustomer",customer);
		if(rows>0)
			System.out.println("您成功修改了"+rows+"条数据");
		else
			System.out.println("执行修改操作失败！");
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	//删除客户
	public void deleteCustomerTest() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		int rows = sqlSession.delete("com.itheima.mapper"+".CustomerMapper.deleteCustomer",4);
		if(rows>0)
			System.out.println("您成功删除了"+rows+"条数据");
		else
			System.out.println("执行删除操作失败！");
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void findAllUserTest() {
		SqlSession sqlSession = MybatisUtils.getSession();
		List<User> list = 
				sqlSession.selectList("com.itheima.mapper.UserMapper.findAllUser");
		for(User user:list) {
			System.out.println(user);
		}
		sqlSession.close();
	}
}
