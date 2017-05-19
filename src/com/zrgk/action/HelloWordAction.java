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
 * 使用配置文件xml的形式 not annotation
 * @author lsx
 *
 */

public class HelloWordAction implements Controller{
	//在配置文件中设置了初始值
	private String helloWorld; // 该属性用于获取配置文件中的helloWorld属性
	private String viewPage; // 用于获取配置文件中的viewPage属性 public
	
	//localhost:8080/spring0518/helloWorld.do
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException { // 在该方法中处理用户请求
		Map model = new HashMap();
		model.put("helloWorld", getHelloWorld());
		// 将helloWorld属性存 入model中
		//页面+数据
		return new ModelAndView(viewPage, model);
		// 调用getViewPage获 取要返回的页面
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
