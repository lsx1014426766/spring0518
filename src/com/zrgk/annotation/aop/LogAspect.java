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
 * 完全采用注解的方式实现，包括配置文件
 * @author lsx
 *
 */
//切面类（公共的行为）
@Component("logAspect")
@Aspect
public class LogAspect {
	@Pointcut("bean(*Service2)")
	public  void  myPointCut(){
	}
	//前置通知
	@Before("myPointCut()")
	public    void  beforeMethod(){
		System.out.println("。。。。前置通知。。日志输出。。。。。。。");
	}
	
	//后置通知
	@AfterReturning(pointcut="execution(* com.zrgk.anotation.service2.*.*(..))",returning="re")
	public    void  afterMethod(Object re){
		System.out.println("。。。。后置通知。。日志输出。。。。。。。"+re);
	
	}
	//环绕通知
	@Around("myPointCut()")
	public Object aroundMethod(ProceedingJoinPoint  pjp) throws Throwable{
		System.out.println(".......环绕通知。。前半部分处理。。。。");
		//调用目标类的目标方法
		Object obj = pjp.proceed(pjp.getArgs());
		System.out.println(".......环绕通知。。后半部分处理。。。。");
		return obj;
	}
	//最终通知
	@After("myPointCut()")
	public   void finallyMethod(){
		System.out.println("......最终通知。。。。。。。。");
	}
	//异常通知
	@AfterThrowing(pointcut="execution(* com.zrgk.anotation.service2.*.*(..))",throwing="ex")
	public   void exceptionMethod(Exception  ex){
		System.out.println("......异常通知。。。。。。。。"+ex.getMessage());
	}
}
