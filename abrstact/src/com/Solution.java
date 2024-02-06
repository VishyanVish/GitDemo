package com;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	System.out.println("Welcome to ATM");
	System.out.println("-------------------");
	Scanner s =new Scanner(System.in);
	Bank b=new ATM();
	while(true)
	{
	System.out.println("1:Deposite\n2:withdraw\n3:Checkbalance\n4:Exit");
	
	System.out.println("enter choise");
	int choise=s.nextInt();
	switch(choise)
	{
	case 1:
		System.out.println("Enter amount");
		int Damt=s.nextInt();
		b.deposite(Damt);
		break;
	case 2:
		System.out.println("enter amount");
		int wamt=s.nextInt();
		b.withdraw(wamt);
		break;
	case 3:
		b.checkbalance();
		break;
	case 4:
		System.out.println("thank you");
		System.exit(0);
	}
	}
}
}