package com;

import java.util.Scanner;

public class custome extends RuntimeException{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter User id");
	 String ID=sc.next();
	 System.out.println("Enter User password");
	int  password=sc.nextInt();
	if(ID.equals("Admin")) {
		if(password==123) {
			System.out.println("login Sussesfully");
		
	}
	else {
		try {
			custome c=new custome();
			throw c;
		}
catch (custome e) {
System.out.println("Incorrct password and id");
}	}
	sc.close();
}
}
}