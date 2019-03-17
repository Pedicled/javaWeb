package com.itheima.jdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import com.itheima.aspect.MyAspect;
/* jdk������ */
public class JdkProxy implements InvocationHandler{
	private UserDao userDao;
	//����������
	public Object createProxy(UserDao userDao){		
		this.userDao = userDao;
		//�������
		ClassLoader classLoader = JdkProxy.class.getClassLoader();	
		//���������userDaoʵ�ֵ����нӿ�
		Class[] clazz = userDao.getClass().getInterfaces();		
		//ʹ�ô����࣬������ǿ�����ص��Ǵ����Ķ���
		return Proxy.newProxyInstance(classLoader, clazz, this);	
	}
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		//��������
		MyAspect myAspect = new MyAspect();	
		//ǰ��ǿ 
		myAspect.check_Permissions();
		//��Ŀ�����ϵ��÷��������������
		Object obj = method.invoke(userDao,args);
		//����ǿ
		myAspect.log();
		return obj;
	}
}
