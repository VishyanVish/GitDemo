package yarago;

import java.util.ArrayList;
import java.util.Scanner;

public class UserStorage {
	
	public static void main(String[] args) {
		ArrayList<user> users = new ArrayList<>();
			Scanner sc=new Scanner(System.in);	
		while(true) {
			System.out.println("Enter Choise\n1:Create User\n2: Login Credentials");
			int Options=sc.nextInt();
			if(Options==1) {
			System.out.println("Enter FirstName");
			String FirstName=sc.next();
			System.out.println("Enter LastName");
			String LastName=sc.next();
			System.out.println("Enter MobileNumber");
			String MobileNumber=sc.next();
			System.out.println("Enter Adress");
			String Adress=sc.next();
			System.out.println("Enter Gender");
			String Gender=sc.next();
			System.out.println("Enter Username");
			String Username=sc.next();
			System.out.println("Enter Password");
			String Password=sc.next();
			System.out.println("Confirm password");
			String Confirm=sc.next();
			if(Password.equals(Confirm)) {
				System.out.println("UserCreated Succesfully");
			}
			else {
				System.out.println(" Password Not Matching ");
			}
			user U=new user(FirstName,LastName,MobileNumber,Adress,Gender,Username,Password);
			users.add(U);
			}
			else  if (Options==2) {
				System.out.println("Enter Username");
				String Username=sc.next();
				System.out.println("Enter Password");
				String Password=sc.next();
				boolean logined=false;
				for (user user : users) 
		            if (user.Username.equals(Username) && user.Password.equals(Password)) {
		            logined =true;
		   System.out.println("login succusfully");
			System.out.println(user);
			}
			if(!logined) {
				System.out.println("login details not exists");
			}
			
	
		
			}
			else {
				System.out.println("Invalid Option");
			}
		
		}
	}
}
	
