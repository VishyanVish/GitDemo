package com;

public class thread extends Thread{
public void run() {
	System.out.println("Thread start");
}
public static void main(String[] args) {
	thread T=new thread();
	T.start();
}
}
