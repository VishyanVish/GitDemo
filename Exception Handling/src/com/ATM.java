package com;

import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int Balance=1000;
	System.out.println("Enter amount");
	int amount=s.nextInt();
	if(amount<=Balance) {
		System.out.println("Withdraw Succsefully");
	}
	else {
		try {
			InsufficientBalanceException ie=new InsufficientBalanceException();
			throw ie;
		}
		catch (InsufficientBalanceException e) {
			System.out.println("Insufficient balance amount");
		}
	}
}
}
