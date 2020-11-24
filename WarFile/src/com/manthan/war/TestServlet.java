package com.manthan.war;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "testServlet",
urlPatterns = {"/test"},
loadOnStartup = 1)

public class TestServlet extends HttpServlet {
	@Override
	  protected void doGet (HttpServletRequest req,HttpServletResponse resp)
	            throws ServletException, IOException {

	      resp.setContentType("text/html");
	      PrintWriter writer = resp.getWriter();
	      writer.println("Hello World");
	  }
}
