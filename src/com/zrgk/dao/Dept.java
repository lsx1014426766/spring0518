package com.zrgk.dao;


import org.springframework.stereotype.Component;
/**
 * 给pojo类添加注解，生成bean
 * @Component(value="dept")
 * @author lsx
 * 默认名就为首字母小写后的值
 */
@Component
public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	
	public Dept() {
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
}
