package com.zrgk.service;

import org.springframework.stereotype.Service;

@Service("dService")
public class DService {
	
	public DService() {
		System.out.println("DService���޲� ���췽��");
	}

	public void addDept(){
		System.out.println("��Ӳ��Ŷ��󡣡�����������");
	}
}
