package com;

  public class ATM implements Bank {
	 int balance=1000;
public void deposite(int amount) {
	System.out.println("depositing Rs."+amount);
	balance=balance+amount;
	System.out.println("amount deposited succesfully");
}
public void withdraw(int amount) {
	System.out.println("depositing Rs."+amount);
	balance=balance-amount;
	System.out.println("amount Withdraw succesfully");
}
public void checkbalance() {
	System.out.println("balance="+balance);
}
}
