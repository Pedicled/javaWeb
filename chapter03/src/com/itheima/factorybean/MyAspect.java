package com.itheima.factorybean;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//������
public class MyAspect implements MethodInterceptor{
	
	public Object invoke(MethodInvocation mi) throws Throwable{
		check_Permissions();
		Object obj = mi.proceed();
		log();
		return obj;
	}
	public void check_Permissions() {
		System.out.println("ģ����Ȩ��");
	}
	public void log() {
		System.out.println("ģ���¼��־");
	}
}
