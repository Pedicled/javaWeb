package com.itheima.cglib;
import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import com.itheima.aspect.MyAspect;
//������
public class CglibProxy implements MethodInterceptor{
	//������
	public Object createProxy(Object target) {
		//����һ����̬�����
		Enhancer enhancer = new Enhancer();
		//ȷ����Ҫ��ǿ���࣬�����丸��
		enhancer.setSuperclass(target.getClass());
		//��ӻص�����
		enhancer.setCallback(this);
		//���ش����Ĵ�����
		return enhancer.create();
	}
	/*
	 * proxy cglib ����ָ���������ɵĴ������
	 * method���صķ���
	 * args���ط����Ĳ�������
	 * methodProxy�����Ĵ����������ִ�и���ķ���
	 */
	public Object intercept(Object proxy,Method method,Object[] args,MethodProxy methodProxy) throws Throwable{
		//�����������
		MyAspect myAspect = new MyAspect();
		//ǰ��ǿ
		myAspect.check_Permissions();
		//Ŀ�귽��ִ��
		Object obj = methodProxy.invokeSuper(proxy,args);
		//����ǿ
		myAspect.log();
		return obj;
	}
}
