package com.zrgk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.zrgk.entity.User;
import com.zrgk.service.DService;
import com.zrgk.service.UService;

public class TestAop {
/**
 *  org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: Unable to locate Spring NamespaceHandler for XML schema namespace [http://www.springframework.org/schema/aop]
Offending resource: class path resource [applicationContext.xml]
 * @param args
 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	    UService uService= (UService)ac.getBean("uService");
	    DService dService= (DService)ac.getBean("dService");
	    uService.addUser();
	    dService.addDept();
	    //制造异常情况
	   uService.addUser2(new User(1,"zsss"));

	    
	}

}
