package com;

public class daughter extends Father {
int z=10;
public static void main(String[] args) {
	Father f=new daughter();

	System.out.println("start");
	if (f instanceof Son)
	{
		System.out.println("Downcasting to son ");
		Son s=(Son)f;
		System.out.println(s.x);
	}
	else if  (f instanceof daughter)
	{
		System.out.println("Downcasting to daughter");
		daughter d=(daughter)f;
		System.out.println(d.z);
	}
}
}
