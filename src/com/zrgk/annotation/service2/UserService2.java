package com.zrgk.annotation.service2;

import org.springframework.stereotype.Service;

import com.zrgk.entity.User;





@Service("userService2")
public class UserService2 {
	public int  addUser(User u){
		System.out.println("添加用户对象。。。。。。。");
		int a = 10;
		int b = 2;
		return a/b;
	}
	
}
