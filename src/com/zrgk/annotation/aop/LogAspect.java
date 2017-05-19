package com.zrgk.annotation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * ��ȫ����ע��ķ�ʽʵ�֣����������ļ�
 * @author lsx
 *
 */
//�����ࣨ��������Ϊ��
@Component("logAspect")
@Aspect
public class LogAspect {
	@Pointcut("bean(*Service2)")
	public  void  myPointCut(){
	}
	//ǰ��֪ͨ
	@Before("myPointCut()")
	public    void  beforeMethod(){
		System.out.println("��������ǰ��֪ͨ������־�����������������");
	}
	
	//����֪ͨ
	@AfterReturning(pointcut="execution(* com.zrgk.anotation.service2.*.*(..))",returning="re")
	public    void  afterMethod(Object re){
		System.out.println("������������֪ͨ������־�����������������"+re);
	
	}
	//����֪ͨ
	@Around("myPointCut()")
	public Object aroundMethod(ProceedingJoinPoint  pjp) throws Throwable{
		System.out.println(".......����֪ͨ����ǰ�벿�ִ���������");
		//����Ŀ�����Ŀ�귽��
		Object obj = pjp.proceed(pjp.getArgs());
		System.out.println(".......����֪ͨ������벿�ִ���������");
		return obj;
	}
	//����֪ͨ
	@After("myPointCut()")
	public   void finallyMethod(){
		System.out.println("......����֪ͨ����������������");
	}
	//�쳣֪ͨ
	@AfterThrowing(pointcut="execution(* com.zrgk.anotation.service2.*.*(..))",throwing="ex")
	public   void exceptionMethod(Exception  ex){
		System.out.println("......�쳣֪ͨ����������������"+ex.getMessage());
	}
}
