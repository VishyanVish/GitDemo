package com;

import java.util.TreeSet;

public class runner {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();
	t.add(10);
	t.add(20);
	t.add(30);
	t.add(5);
	for(int i:t) {
		System.out.println(i);
	}
}
}
