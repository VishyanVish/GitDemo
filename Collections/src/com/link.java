package com;

import java.util.LinkedList;

public class link {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(20);
	l.add(30);
	System.out.println(l);
	
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
	l.add(20.5);
	for(Object o:l) {
		System.out.println(o);
	}
}
}
