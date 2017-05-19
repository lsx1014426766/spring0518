package com.zrgk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zrgk.dao.Dept;
import com.zrgk.dao.IDeptDao;
import com.zrgk.dao.impl.DeptHibernateDaoImpl;
import com.zrgk.dao.impl.DeptJDBCDaoImpl;
import com.zrgk.service.IDeptService;
@Service("deptService")
public class DeptServiceImpl implements IDeptService{
	
	private IDeptDao dao;
//	@Resource(name="deptDao")   //先按照名称注入，不行的话再按照类型转入
	// 先按照类型注入，如果按照类型注入出现冲突的话，
	//在通过Qualifier注解指定名称
	@Autowired
	@Qualifier("deptDao")
	public void setDao(IDeptDao dao) {
		System.out.println("setDao.........");
		this.dao = dao;
	}


	@Override
	public void saveDept(Dept dept) {
		dao.insertDept(dept);
	}

}
