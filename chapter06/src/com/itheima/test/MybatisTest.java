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
	
	
	//���ݿͻ���Ų�ѯ�ͻ���Ϣ
	public void findCustomerByIdTest() throws Exception{
		//��ȡ�����ļ�
		String resource = "mybatis-config.xml";
		InputStream inputStream = 
				Resources.getResourceAsStream(resource);
		//���������ļ�����SqlSession
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		//ͨ��SqlSessionFactory����SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		Customer customer = sqlSession.selectOne("com.itheima.mapper"+".CustomerMapper.findCustomerById",1);
		System.out.println(customer.toString());
		sqlSession.close();
	}
	
	
	//�����û�������ģ����ѯ�û���Ϣ�б�
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
	
	
	//��ӿͻ�
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
		//����SQL���Ӱ�������
		int rows = sqlSession.insert("com.itheima.mapper"+".CustomerMapper.addCustomer",customer);
		if(rows>0)
			System.out.println("���ɹ�������"+rows+"������");
		else
			System.out.println("ִ�в������ʧ�ܣ�");
		//�ύ����
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	//���¿ͻ�
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
			System.out.println("���ɹ��޸���"+rows+"������");
		else
			System.out.println("ִ���޸Ĳ���ʧ�ܣ�");
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	//ɾ���ͻ�
	public void deleteCustomerTest() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = 
				new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		int rows = sqlSession.delete("com.itheima.mapper"+".CustomerMapper.deleteCustomer",4);
		if(rows>0)
			System.out.println("���ɹ�ɾ����"+rows+"������");
		else
			System.out.println("ִ��ɾ������ʧ�ܣ�");
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
