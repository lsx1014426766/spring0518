package com.zrgk.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * ʹ�������ļ�xml����ʽ not annotation
 * @author lsx
 *
 */

public class HelloWordAction implements Controller{
	//�������ļ��������˳�ʼֵ
	private String helloWorld; // ���������ڻ�ȡ�����ļ��е�helloWorld����
	private String viewPage; // ���ڻ�ȡ�����ļ��е�viewPage���� public
	
	//localhost:8080/spring0518/helloWorld.do
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException { // �ڸ÷����д����û�����
		Map model = new HashMap();
		model.put("helloWorld", getHelloWorld());
		// ��helloWorld���Դ� ��model��
		//ҳ��+����
		return new ModelAndView(viewPage, model);
		// ����getViewPage�� ȡҪ���ص�ҳ��
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}

	public String getViewPage() {
		return this.viewPage;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getHelloWorld() {
		return this.helloWorld;
	}


}
