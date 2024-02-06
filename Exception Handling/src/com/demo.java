package com;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
	System.out.println("Start");
	Scanner scan=new Scanner(System.in);
	System.out.println("enter value of a");
	int a=scan.nextInt();
	System.out.println("enter value of b");
	int b=scan.nextInt();
	try{
		System.out.println(a/b);
	}
	catch(ArithmeticException e) {
		System.out.println("invalid input ");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Inavlid index");
	}
	catch(Exception e) {
		System.out.println("Invalid denominator");
	}
	scan.close();
}
}
