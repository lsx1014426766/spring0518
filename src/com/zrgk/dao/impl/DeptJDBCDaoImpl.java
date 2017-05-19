package com.zrgk.dao.impl;

import org.springframework.stereotype.Repository;

import com.zrgk.dao.Dept;
import com.zrgk.dao.IDeptDao;
@Repository("deptDao1")
public class DeptJDBCDaoImpl implements IDeptDao {
	public DeptJDBCDaoImpl() {
		System.out.println("DeptJDBCDaoImpl无参构造方法。。。。。。。。");
	}
	
	@Override
	public void insertDept(Dept dept) {
		System.out.println("通过jdbc的方式添加部门对象------");
	}
}
