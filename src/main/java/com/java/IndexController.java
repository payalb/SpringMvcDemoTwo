package com.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//ModelAndView represents Model, i.e. data to be displayed on page , 
		//View represents view name (which jsp/html page)
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index"); //return the name of the view
		//It will not have information of what is ur view extension and in which folder it is.
		mv.addObject("message", "Welcome to index page");
		return mv;
	}

}
