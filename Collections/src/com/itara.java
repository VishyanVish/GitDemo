package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class itara {
public static void main(String[] args) {
	ArrayList l1=new ArrayList<>();
	l1.add(23);
	l1.add(34);
	l1.add("vishwa");
	l1.add('c');
	ListIterator it=l1.listIterator();
	while(it.hasNext()) {
	Object	obj=it.next();
	System.out.println(obj);
	}
	
	System.out.println(" -------------------------------------------size "+l1.size());
	while (it.hasPrevious()) {
		Object obj=it.previous();
				System.out.println(obj);
		
	}
}
}
