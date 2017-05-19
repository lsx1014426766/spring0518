package com.zrgk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zrgk.annotation.service2.DeptService2;
import com.zrgk.annotation.service2.UserService2;


public class TestAopAnonatation {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
	    UserService2 service2= (UserService2)ac.getBean("userService2");
	    DeptService2 service3= (DeptService2)ac.getBean("deptService2");
	    service2.addUser(new com.zrgk.entity.User(1,"zsss"));
	    service3.addDept();
	}

}
