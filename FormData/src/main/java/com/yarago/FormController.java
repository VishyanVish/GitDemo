package com.yarago;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormController extends HttpServlet {
private static final long serialVersionUID = 1L;

public FormController() {
    super();
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uri = request.getRequestURI();
	System.out.println(uri);
		//PrintWriter pg=response.getWriter();
	//	pg.print("hiii");
		String name=request.getParameter("name");
		System.out.println(name);
		 int age=Integer.parseInt(request.getParameter("age"));
		 String mobile=request.getParameter("Mobile"); 
		 String gender=request.getParameter("gender"); 
		 String  email=request.getParameter("email"); 
		 String	  password=request.getParameter("password"); 
		 String  dob=request.getParameter("date");
		 response.sendRedirect("home.jsp");
		 System.out.println(dob);
		  try { Class.forName("com.mysql.jdbc.Driver");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","yarago123");
		  PreparedStatement pstm=con.prepareStatement("insert into form_data values(?,?,?,?,?,?,?)");
		  pstm.setString(1, name); 
		  pstm.setInt(2, age);
		  pstm.setString(3, mobile);
		 pstm.setString(4, gender);
		 pstm.setString(5, email); 
		 pstm.setString(6, password); 
		 pstm.setString(7, dob);
		 pstm.execute();
		 }
		  
		 catch (ClassNotFoundException | SQLException e){ // TODO Auto-generated catch block e.printStackTrace(); 
			 }
		 
		 
		 
	}
		 
	
	}


