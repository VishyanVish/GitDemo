package vishwa.java;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a[]=new int[100];
		int b=sc.nextInt();
		
		if (b%2==0) {
			System.out.println("given number is Even and next 100 even number are");
		}
		else {
			System.out.println("Given number is Odd and next 100 odd number are");
		}
		int temp=0;
		for(int i=1;i<=100;i++){
			
			b=b+2;
			System.out.println(b);
			temp=temp+b;
			System.out.println(a[b]);

		}
		
		System.out.println("Sum of 100 consicative number "+temp);
	}
	}

