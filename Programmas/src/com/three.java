package com;

import java.util.Scanner;

public class three {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int a=sc.nextInt();
	for (int i=1;i<a;i++) {
		if(i%2==0) {
		System.out.println(i-1);
		
	}
		else {
			System.out.println(i+1);
		}
}
}
}