package com;

import java.util.Scanner;

public class eight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		int a=0,b=1;
				int c = 0;
		for (int i=0;i<n;i++) {
			
		c=a+b;
		System.out.println(a);
		a=b;
		b=c;
			}
	}
}
