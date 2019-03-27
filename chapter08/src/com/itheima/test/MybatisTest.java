package com.itheima.test;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.itheima.po.Customer;
import com.itheima.utils.MybatisUtils;

public class MybatisTest {
	
	public void findCustomerByNameAndJobsTest() {
		SqlSession session = MybatisUtils.getSession();
		Customer customer = new Customer();
		customer.setUsername("jack");
		customer.setJobs("teacher");
		List<Customer> customers = session.selectList("com.itheima.mapper"+".CustomerMapper.findCustomerByNameAndJobs",customer);
		for(Customer customer2: customers) {
			System.out.println(customer2);
		}
		session.close();
	}
	
	public void findCustomerByNameOrJobsTest() {
		SqlSession session = MybatisUtils.getSession();
		Customer customer = new Customer();
		customer.setUsername("jack");
		customer.setJobs("teacher");
		List<Customer> customers = session.selectList("com.itheima.mapper"+".CustomerMapper.findCustomerByNameOrJobs",customer);
		for(Customer customer2:customers) {
			System.out.println(customer2);
		}
		session.close();
	}
	

	public void updateCustomerTest() {
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer customer = new Customer();
		customer.setID(3);
		customer.setPhone("12345678912");
		int rows = sqlSession.update("com.itheima.mapper"+".CustomerMapper.updateCustomer",customer);
		if(rows>0)
				System.out.println("您成功修改了"+rows+"条数据！");
		else
			System.out.println("执行修改操作失败！");
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void findCustomerByIdsTest() {
		SqlSession session = MybatisUtils.getSession();
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		List<Customer> customers = session.selectList("com.itheima.mapper.CustomerMapper"+".findCustomerByIds",ids);
		for(Customer customer:customers) {
			System.out.print(customer);
		}
		session.close();
	}
	
	@Test
	public void findCustomerByNameTest() {
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer customer = new Customer();
		customer.setUsername("j");
		List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper"+".findCustomerByName",customer);
		for(Customer customer2:customers) {
			System.out.println(customer2);
		}
		sqlSession.close();
	}
}
