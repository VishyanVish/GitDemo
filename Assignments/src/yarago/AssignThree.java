package yarago;

import java.util.Scanner;

public class AssignThree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Choise\n1:Create User\n2: Login Credentials");
	int Option=sc.nextInt();
switch (Option) {
	case 1:
	System.out.println("Create User");	
	System.out.println("Enter FirstName");
	String name=sc.next();
	System.out.println("Enter LastName");
	String Last=sc.next();
	System.out.println("Enter MobileNumber");
	String Mobile=sc.next();
	System.out.println("Enter Adress");
	String Adress=sc.next();
	System.out.println("Enter Gender");
	String Gender=sc.next();
	System.out.println("Enter Username");
	String username=sc.next();
	System.out.println("Enter Password");
	String Pass=sc.next();
	System.out.println("Confirm password");
	String Confirm=sc.next();
	if(Pass.equals(Confirm)) {
		System.out.println("UserCreated Succesfully");
	}
	else {
		System.out.println(" Password Not Matching ");
	}
	break;
	case 2:
		System.out.println("Login Credentials");	
		String Username="Vishwa";
		String Password="1234";
		System.out.println("Username:"+Username+"\n"+"Password:"+Password);
		break;		
	default:
		System.out.println("invalid Option");
		break;
	}
sc.close();
}
}
