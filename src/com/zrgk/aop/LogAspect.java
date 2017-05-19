package com.zrgk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//切面类（公共的行为）
public class LogAspect {
	public  void  myPointCut(){
	}

	//前置通知
		public    void  beforeMethod(){
			System.out.println("。。。。前置通知。。日志输出。。。。。。。");
		}
		
		//后置通知 注意这里参数名re和xml定义中保持一致
		public    void  afterMethod(Object re){
			System.out.println("。。。。后置通知。。日志输出。。。。。。。"+re);
		
		}
		//环绕通知
		public Object aroundMethod(ProceedingJoinPoint  pjp) throws Throwable{
			System.out.println(".......环绕通知。。前半部分处理。。。。");
			//调用目标类的目标方法  重点是调用方法这个过程，不是返回
			Object obj = pjp.proceed(pjp.getArgs());
			System.out.println(".......环绕通知。。后半部分处理。。。。");
			return obj;
		}
		//最终通知
		public   void finallyMethod(){
			System.out.println("......最终通知。。。。。。。。");
		}
		//异常通知
		public   void exceptionMethod(Exception  ex){
			System.out.println("......异常通知。。。。。。。。"+ex.getMessage());
		}

	
}
