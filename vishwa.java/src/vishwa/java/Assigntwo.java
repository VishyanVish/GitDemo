package vishwa.java;

import java.util.Scanner;

public class Assigntwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		
		if (a%2==0) {
			System.out.println("given number is Even and next 100 even number are");
		}
		else {
			System.out.println("Given number is Odd and next 100 odd number are");
		}
		int temp=0;
		for(int i=0;i<=100;i++){
			a=a+2;
			System.out.println(a);
			temp=temp+a;
		}
		System.out.println("Sum of 100 consicative number "+temp);
	}
	}


