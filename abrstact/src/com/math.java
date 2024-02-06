package com;

public class math implements calculate{
public 	int add(int a,int b) {
	System.out.println("sum of a and b is "+(a+b));	
	return a+b;
	}
public 	int sup(int a,int b) {
	System.out.println("Sup of a and b is "+(a-b));	
	return a-b;
}
public 	int multi(int a,int b) {
	System.out.println("multi of a and b is "+(a*b));
	return a*b;
}
public 	int divid(int a,int b) {
	System.out.println("Sup of a and b is "+(a/b));
	return a/b;
}
}
