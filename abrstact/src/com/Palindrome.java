package com;



public class Palindrome {
	public static void main(String[] args) {
		int a=0,sum=0,temp;
		
		int n=450;
		
		
		temp=n;
		while(n>0) {
			a=n%10;
			sum=(sum*10)+a;
n=n/10;
		}
			if(temp==sum)
			{
				System.out.println("palindrom");
			}
			else {
				System.out.println("not palindrom");
			}
}
	}

