package com;

import java.util.LinkedList;

public class que {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		//empty list without capacity
		//behave like list and queue
		int n=l1.size();
		System.out.println("List elements: "+n);
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		l1.add(700);
		//n=l1.size();
		System.out.println("List elements");
		System.out.println(l1);
		System.out.println("Removing first element from the queue");
		l1.poll();//to remove all print 7times l1.poll()
		//queue specific method --remove the first element from the queue
		Object o1=l1.poll();//if queue is empty it returns null
		while(o1!=null) {
			System.out.println(o1);
			o1=l1.poll();
		}
	 
		System.out.println("List elements");
		System.out.println(l1);

	}
}
