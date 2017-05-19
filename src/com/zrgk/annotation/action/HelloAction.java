package com.zrgk.annotation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAction {
	//localhost:8080/spring0518/welcome.do
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)  
    ///jsp/welcom.jsp   
    public String registPost() {  
        return "/welcome";
       }  
	
	//如果请求为localhost:8080/spring0518/login/tom.do?id=20
    //user变量值为tom,id变量值为20
	@RequestMapping(value = "/login/{user}", method = RequestMethod.GET)   
    public ModelAndView myMethod(HttpServletRequest request, HttpServletResponse response,     
            @PathVariable("user") String user,@RequestParam("id") String id, ModelMap modelMap) throws Exception {  
        modelMap.put("loginUser", user);
        modelMap.put("userId", id);
        ///jsp/hello.jsp   
        return new ModelAndView("/hello", modelMap);
    }   

}
