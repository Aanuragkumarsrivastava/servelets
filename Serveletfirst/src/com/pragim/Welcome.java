package com.pragim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome implements Servlet {

	@Override
	public void destroy() 
	{
		System.out.println("insde destroy");
	}

	@Override
	public ServletConfig getServletConfig() 
	{
		return null;
	}

	@Override
	public String getServletInfo() 
	{
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException
	{
		System.out.println("inside init");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter p=res.getWriter();
		System.out.println("<h1>WELCOME TO SERVELETS</h1>");
	}

}
