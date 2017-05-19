package com.zrgk.service;

import org.springframework.stereotype.Service;

@Service("dService")
public class DService {
	
	public DService() {
		System.out.println("DService类无参 构造方法");
	}

	public void addDept(){
		System.out.println("添加部门对象。。。。。。。");
	}
}
