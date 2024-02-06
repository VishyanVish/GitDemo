package com;

public class thread2 extends Thread {
public void run() {
	System.out.println("thread 2 started ");
	for(int i=0;i<=20;i++) {
		System.out.println(i);
		
	}
}
}
