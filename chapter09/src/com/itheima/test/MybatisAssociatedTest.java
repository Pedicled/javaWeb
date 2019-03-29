package com.itheima.test;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.itheima.po.Person;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;

public class MybatisAssociatedTest {
	

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
	
	@Test
	public void findUserTest() {
		SqlSession session = MybatisUtils.getSession();
		User user = session.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders",1);
		System.out.println(user);
		session.close();
	}
}
