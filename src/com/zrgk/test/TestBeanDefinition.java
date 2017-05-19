package com.zrgk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zrgk.entity.TestEntity;
import com.zrgk.entity.User;

public class TestBeanDefinition {

	public static void main(String[] args) {
		// 使用ApplicationContext接口的实现类ClassPathXmlApplicationContext加载Spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		TestEntity entity = (TestEntity) ctx.getBean("entity");
		
		entity.showValue();
		User user = (User) ctx.getBean("user");
		System.out.println(user);
	}

}
