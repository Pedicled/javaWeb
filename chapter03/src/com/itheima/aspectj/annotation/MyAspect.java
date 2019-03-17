package com.itheima.aspectj.annotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//�����࣬��д֪ͨ
@Aspect
@Component
public class MyAspect {
	@Pointcut("execution(* com.itheima.jdk.*.*(..))")
	private void myPointCut() {} 
	//ǰ��֪ͨ
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ��ģ��ִ��Ȩ�޼��...,");
		System.out.println("Ŀ�����ǣ�"+joinPoint.getTarget());
		System.out.println(",��ֲ����ǿ�����Ŀ�귽��Ϊ��"+joinPoint.getSignature().getName());
	}
	//����֪ͨ
	@AfterReturning("myPointCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("����֪ͨ��ģ���¼��־...,");
		System.out.println("��ֲ����ǿ�����Ŀ�귽��Ϊ��"+joinPoint.getSignature().getName());
	}
	/*
	 * ����֪ͨ
	 * ProceedingJoinPoint��JoinPoint�ӽӿڣ���ʾ����ִ��Ŀ�귽��
	 */
	@Around("myPointCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("���ƿ�ʼ��ִ��Ŀ�귽��֮ǰ��ģ�⿪������");
		Object obj = proceedingJoinPoint.proceed();	//ִ��Ŀ�귽��
		System.out.println("���ƽ�����ִ��Ŀ�귽��֮��ģ��ر�����...");
		return obj;
	}
	//�쳣֪ͨ
	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("�쳣֪ͨ��"+"������"+e.getMessage());
	}
	//����֪ͨ
	@After("myPointCut()")
	public void myAfter() {
		System.out.println("����֪ͨ��ģ�ⷽ����������ͷ���Դ...");
	}
}
