package com;

public class subclass extends Upcasting{
int y=10;
String nam="run";
public static void main(String[] args) {
	subclass u=new subclass();
	//subclass s=  (subclass) u;
	System.out.println(u.x+" "+u.name);
	System.out.println(u.y+" "+u.nam);
}
}