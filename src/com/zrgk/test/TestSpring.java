package com.zrgk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zrgk.dao.Dept;
import com.zrgk.dao.IDeptDao;
import com.zrgk.service.IDeptService;

public class TestSpring {
	public static void main(String[] args) {
		//��ȡspring����������
		/**
		 * �˶β��Դ�����ͬ���ɸ�������bean��ע�ⷽʽ�ֱ����
		 */
		ApplicationContext ac = 
			new  ClassPathXmlApplicationContext("applicationContext.xml"); 
		IDeptService service = (IDeptService)ac.getBean("deptService");
//		IDeptService service2 = (IDeptService)ac.getBean("deptService");
//		System.out.println(service==service2);
		Dept dept = (Dept)ac.getBean("dept");
		service.saveDept(dept);
//		System.out.println(dept.getDname());
	}

}
