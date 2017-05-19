package com.zrgk.dao.impl;

import org.springframework.stereotype.Repository;

import com.zrgk.dao.Dept;
import com.zrgk.dao.IDeptDao;
@Repository("deptDao")
public class DeptHibernateDaoImpl implements IDeptDao {
	public DeptHibernateDaoImpl() {
		System.out.println("DeptHibernateDaoImpl无参构造方法。。。。。。。。");
	}
	@Override
	public void insertDept(Dept dept) {
		System.out.println("通过hibernate的方式添加部门对象------");
	}

}
