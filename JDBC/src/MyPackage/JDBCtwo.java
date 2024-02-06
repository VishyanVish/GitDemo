package MyPackage;

import java.sql.*;

public class JDBCtwo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","yarago123");
	PreparedStatement pstm=con.prepareStatement("insert into marks values(?,?,?,?,?)");
	pstm.setInt(1, 1);
	pstm.setString(2, "Vishwa");
	pstm.setInt(3, 78);
	pstm.setString(4, "ABC");
	pstm.setString(5, "A");
	pstm.execute();
	}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
