package com.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GETPOSTServlet
 */
@WebServlet("post")
public class GETPOSTServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();
	out.print("welcome to get servlet <br><br>");
	String fname=request.getParameter("fname");
	String pass=request.getParameter("password");
	
	out.print("username: "+fname+"<br>");
	out.print("password: "+pass);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	
	}

}
