package com.zrgk.dao.impl;

import org.springframework.stereotype.Repository;

import com.zrgk.dao.Dept;
import com.zrgk.dao.IDeptDao;
@Repository("deptDao")
public class DeptHibernateDaoImpl implements IDeptDao {
	public DeptHibernateDaoImpl() {
		System.out.println("DeptHibernateDaoImpl�޲ι��췽������������������");
	}
	@Override
	public void insertDept(Dept dept) {
		System.out.println("ͨ��hibernate�ķ�ʽ��Ӳ��Ŷ���------");
	}

}
