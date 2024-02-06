package com;

public class AccountHolder {
public static void main(String[] args) {
	Bank obj=new ATM();
	obj.checkbalance();
	
	obj.deposite(4000);
	obj.checkbalance();
	
	obj.withdraw(1000);
	obj.checkbalance();
}
}
