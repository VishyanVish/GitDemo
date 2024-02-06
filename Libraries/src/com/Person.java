package com;

public class Person {
@Override
	public String toString() {
		return ("hii dinga");
	}
	
public static void main(String[] args) {
	Person p=new Person();
	System.out.println(p);// implicitly calling toString methode
	
}
}
