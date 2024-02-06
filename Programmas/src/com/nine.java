package com;

import java.util.Scanner;

public class nine {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int n=sc.nextInt();
	int a=1,b=1,c=0;
	for(int i=0;i<n;i++) {
		if(i%2==0) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
		else {
			System.out.println(i);
		}
	}
}
}
