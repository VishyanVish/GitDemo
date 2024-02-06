package com;

import java.util.HashSet;

public class day {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(12);
	h.add(20.5);
	h.add(12);
	System.out.println(h);
	
	
	for(Object d:h) {
		System.out.println(d);
	}
}
}
