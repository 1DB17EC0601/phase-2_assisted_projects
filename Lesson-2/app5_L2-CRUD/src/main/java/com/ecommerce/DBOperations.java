package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DBOperations
 */
@WebServlet("/DBOperations")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  try {
              PrintWriter out = response.getWriter();
              out.println("<html><body>");
              
             InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
             Properties props = new Properties();
             props.load(in);
             
             
             DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
             Statement stmt = conn.getConnection().createStatement();
             stmt.executeUpdate("create database simplilearn1");
             out.println("Created database: simplilearn1<br>");
             stmt.executeUpdate("use simplilearn1");
             out.println("Selected database: simplilearn1<br>");
             stmt.executeUpdate("drop database simplilearn1");
             stmt.close();
             out.println("Dropped database: simplilearn1<br>");
             
             
             
             
             
             conn.closeConnection();
             
             
             out.println("</body></html>");
             conn.closeConnection();
             
     } catch (ClassNotFoundException e) {
             e.printStackTrace();
     } catch (SQLException e) {
             e.printStackTrace();
     }

	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
