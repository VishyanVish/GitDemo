package com;

import java.util.PriorityQueue;

public class Quetwo {
	public static void main(String[] args) {
			PriorityQueue q1=new PriorityQueue();
			//creates empty queue with capacity of l1
			int n=q1.size();
			System.out.println("Queue size: "+n);
			q1.add(12);
			q1.add(23);
			q1.add(5);
			q1.add(10);
			q1.add(15);
			q1.add(10);
			q1.add(null);
			n=q1.size();
			System.out.println("Queue Size: "+n);
			System.out.println("Queue elements");
			System.out.println(q1);
			//unorderd list
			System.out.println("removing  elements from queue");
			Object o1=q1.poll();//if queue is empty it returns null
			while(o1!=null) {
				System.out.println(o1);
				o1=q1.poll();
			}
			System.out.println("Queue elements");
			System.out.println(q1);
		}
}
