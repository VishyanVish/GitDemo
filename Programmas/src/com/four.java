package com;

import java.util.Scanner;

public class four {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int a=sc.nextInt();
	for (int i=0;i<a;i++) {
		//System.out.println((int)Math.pow(2, i));
		System.out.println(1<<i);
}
}
}