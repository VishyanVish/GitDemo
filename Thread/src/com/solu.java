package com;

public class solu {
public static void main(String[] args) {
	thread2 t2=new thread2();
	sequence t1=new sequence();

	t1.start();
	t2.start();
	t1.setPriority(1);
	t2.setPriority(5);
}
}
