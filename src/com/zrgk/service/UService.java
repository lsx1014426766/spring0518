package com.zrgk.service;

import org.springframework.stereotype.Service;

import com.zrgk.entity.User;

@Service("uService")
public class UService {
	public void addUser(){
		System.out.println("����û����󡣡�����������");
	}
	public int  addUser2(User u){
		System.out.println("����û�����2��������������");
		int a = 10;
		int b = 0;
		return a/b;
	}
	
}
