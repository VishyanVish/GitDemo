package com;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class Listitirator {
	public static void main(String[] args) {
		System.out.println("main method started");
		ArrayList l1=new ArrayList();
		l1.add(120);
		l1.add(2.4);
		l1.add("developer");
		l1.add(true);
		l1.add(null);
		
		l1.add('j');
		System.out.println("Total elements in List: "+l1.size());
		ListIterator itr1=l1.listIterator();
		System.out.println("List elements in forward direction");
		while(itr1.hasNext())
		{
			Object element =itr1.next();//moves the cursor to next element in collection
			//and returns its reference
			System.out.println(element);
		}
		System.out.println("List elements in Reverse direction");
		while(itr1.hasPrevious())
		{
			Object element =itr1.previous();// returns its reference to element where cursor is pointing
			//and move to previous element
			System.out.println(element);
		}
		


}}