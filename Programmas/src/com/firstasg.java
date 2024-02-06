package com;

import java.util.Scanner;

public class firstasg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int a=sc.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
		System.out.println(i);
		count++;
	}
	System.out.println("count"+count);
}
}
