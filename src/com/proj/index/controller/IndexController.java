package com.proj.index.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.common.util.HttpUtils;

@WebServlet("/index" )  
public class IndexController  extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 基础设置
		HttpUtils.defaultServletSetting(req, resp);
		
		 req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req,resp);
	}
	
	
	
}
