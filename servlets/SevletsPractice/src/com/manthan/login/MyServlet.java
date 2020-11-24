package com.manthan.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet Config & Servlet Context
 */

public class MyServlet  extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		out.println("Hi ");
		
		ServletConfig cg=getServletConfig();
		String str=cg.getInitParameter("name");
		out.println(str);
		
	/*	ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("name");
		out.println(str);*/
	}

}
