package com.yarago;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 
@WebServlet("/getDetails")
public class details extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name=request.getParameter("name");

	entitydao dao=new entitydao();
	entity  e=dao.getEntity(name);
	HttpSession session =request.getSession();
	session.setAttribute("entity", e);
response.sendRedirect("Entity.jsp");

System.out.println(e);
	}

}