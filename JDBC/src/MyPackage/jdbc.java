package MyPackage;
 // Jar FIle :: (JAVA Archive):: built in functions.(simpifications of web app)
// Present in ZIP FIle format.
// JAr file contains .java(source code) .class(byte code) . config files (.xml and .Properties)
// API : Contains Interface,HelperClass,ImplimentationClass present in the form^
// URl :Protocal,host+port/domain numner,resource name
//class loading : Loading thr dot class file into JVM memory.
// two ways : 1. By calling any member of a class ex:variable, static member non-sm constractor
//2 /By static methode called forName(), whenever user this methode throws exception. (forName(0
// methode present in class by name Class itself
import java.sql.*;

public class jdbc {
public static void main(String[] args) {
	// Load Drivers.
	
	
	try {
	try {
        Class.forName("com.mysql.jdbc.Driver");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","yarago123");
		Statement stm =conn.createStatement();
//		String query="Create database studentdatabase";
//		stm.execute(query);
		stm.execute("alter table `marks` add column `Remarks` Varchar(100) not null " );

		System.out.println("Connection Succusfully");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 
}
