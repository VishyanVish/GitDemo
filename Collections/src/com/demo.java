package com;

import java.util.ArrayList;

public class demo {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(10);
	l.add(20.34);
	l.add(null);
	l.add("java");
	System.out.println(l);
	
	System.out.println(l.size());
	
	System.out.println(l.contains("java"));
	System.out.println(l.remove(3));
	System.out.println(l);
}
}