package com;

public class AccountHolder implements HDFCbank {
@Override
	public void deposite()
{
	System.out.println("Deposite");
}
public void withdraw()
{
	System.out.println("Withdraw");
}
public static void main(String[] args) {
	AccountHolder ac =new AccountHolder();
	ac.deposite();
	ac.withdraw();
}
}
