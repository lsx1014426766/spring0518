package com.zrgk.service;

import org.springframework.stereotype.Service;

import com.zrgk.entity.User;

@Service("uService")
public class UService {
	public void addUser(){
		System.out.println("添加用户对象。。。。。。。");
	}
	public int  addUser2(User u){
		System.out.println("添加用户对象2。。。。。。。");
		int a = 10;
		int b = 0;
		return a/b;
	}
	
}
