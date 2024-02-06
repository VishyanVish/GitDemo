package com;

public class sequence extends Thread {
public void run() {
	System.out.println("thread 1 started");
	for(int i=0;i<=20;i++) {
		System.out.println(i);
		
	}
}
}
