package com.itheima.test;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.itheima.po.*;
import com.itheima.utils.MybatisUtils;

public class MybatisAssociatedTest {
	
//一对一
	public void findPersonByIDTest() {
		SqlSession session = MybatisUtils.getSession();
		Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonID",1);
		System.out.println(person);
		session.close();
	}
	public void findPersonByIDTest2() {
		SqlSession session = MybatisUtils.getSession();
		Person person = session.selectOne("com.itheima.mapper.PersonMapper.findPersonID2",1);
		System.out.println(person);
		session.close();
	}
	
//一对多
	public void findUserTest() {
		SqlSession session = MybatisUtils.getSession();
		User user = session.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders",1);
		System.out.println(user);
		session.close();
	}
	
//多对多
	@Test
	public void findOrdersTest() {
		SqlSession session = MybatisUtils.getSession();
		Orders orders = session.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithProduct",1);
		System.out.println(orders);
		session.close();
	}
}
