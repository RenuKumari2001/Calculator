package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addTwoNumber")

public class AddServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=req.getParameter("num1");
		String n1=req.getParameter("num2");
		int num1=Integer.parseInt(n);
		int num2=Integer.parseInt(n1);
		int sum=num1+num2;
		PrintWriter out =res.getWriter();
		out.print("<h1>Addition of two numbers "+sum+" </h1>");
	}
}
