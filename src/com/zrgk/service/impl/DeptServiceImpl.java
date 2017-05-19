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
//	@Resource(name="deptDao")   //�Ȱ�������ע�룬���еĻ��ٰ�������ת��
	// �Ȱ�������ע�룬�����������ע����ֳ�ͻ�Ļ���
	//��ͨ��Qualifierע��ָ������
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
