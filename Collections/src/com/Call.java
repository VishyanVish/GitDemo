package com;

import java.util.LinkedList;

public class Call {

	public static void main(String[] args) {
	test t1=new test(21,"Vishwa");
	test t2=new test(22,"Vishwa");
	LinkedList<test> l=new LinkedList<>();
	l.add(t1);
	l.add(t2);
	for(test o:l) {
		System.out.println(o);
		//System.out.println(o.age+"  "+o.name);
	}
	}

}