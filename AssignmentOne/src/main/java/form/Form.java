package form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */

public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pg=response.getWriter();
	
	String name=request.getParameter("name");
	int age=Integer.parseInt(request.getParameter("age"));
	String mobile=request.getParameter("Mobile");
	String gender=request.getParameter("gender");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
    String dob=request.getParameter("date");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
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
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
