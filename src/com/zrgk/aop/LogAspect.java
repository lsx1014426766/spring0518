package com.zrgk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//�����ࣨ��������Ϊ��
public class LogAspect {
	public  void  myPointCut(){
	}

	//ǰ��֪ͨ
		public    void  beforeMethod(){
			System.out.println("��������ǰ��֪ͨ������־�����������������");
		}
		
		//����֪ͨ ע�����������re��xml�����б���һ��
		public    void  afterMethod(Object re){
			System.out.println("������������֪ͨ������־�����������������"+re);
		
		}
		//����֪ͨ
		public Object aroundMethod(ProceedingJoinPoint  pjp) throws Throwable{
			System.out.println(".......����֪ͨ����ǰ�벿�ִ���������");
			//����Ŀ�����Ŀ�귽��  �ص��ǵ��÷���������̣����Ƿ���
			Object obj = pjp.proceed(pjp.getArgs());
			System.out.println(".......����֪ͨ������벿�ִ���������");
			return obj;
		}
		//����֪ͨ
		public   void finallyMethod(){
			System.out.println("......����֪ͨ����������������");
		}
		//�쳣֪ͨ
		public   void exceptionMethod(Exception  ex){
			System.out.println("......�쳣֪ͨ����������������"+ex.getMessage());
		}

	
}
