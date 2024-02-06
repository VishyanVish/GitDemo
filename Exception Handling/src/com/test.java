package com;

public class test {
public static void main(String[] args) {
	System.out.println("start");
	try{
		System.out.println(10/0);
	}
	catch (ClassCastException e) {
		
//e.printStackTrace();
System.out.println(e.getMessage());
	}
	finally {
		System.out.println("end");
	}
}
}
